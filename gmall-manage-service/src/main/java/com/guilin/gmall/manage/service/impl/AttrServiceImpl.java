package com.guilin.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.guilin.gmall.bean.PmsBaseAttrInfo;
import com.guilin.gmall.bean.PmsBaseAttrValue;
import com.guilin.gmall.manage.mapper.AttrInfoMapper;
import com.guilin.gmall.manage.mapper.AttrValueMapper;
import com.guilin.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    AttrInfoMapper attrInfoMapper;
    @Autowired
    AttrValueMapper attrValueMapper;

    //根据三级目录的id查询对应的属性列表
    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        List<PmsBaseAttrInfo> attrInfo = attrInfoMapper.attrInfoList(catalog3Id);
        return attrInfo;
    }

    //根据属性的id查询对应的value的list
    @Override
    public List<PmsBaseAttrValue> getAttrValueList(int attrId) {

        List<PmsBaseAttrValue> attrValue = attrInfoMapper.getAttrValueList(attrId);
        return attrValue;
    }
    //保存和更新属性以及属性对应的值
    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {

        long id = pmsBaseAttrInfo.getId();
        //System.out.println(id);
        if (id == 0) {
            List<PmsBaseAttrValue> attrValueList = pmsBaseAttrInfo.getAttrValueList();

            //id为空时为增加数据
            attrInfoMapper.insert(pmsBaseAttrInfo);

            for (PmsBaseAttrValue pmsBaseAttrValue : attrValueList) {

                pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());

                attrValueMapper.insert(pmsBaseAttrValue);
            }



        }else{
            //id不为空就是修改数据
            List<PmsBaseAttrValue> attrValueList = pmsBaseAttrInfo.getAttrValueList();
            UpdateWrapper<PmsBaseAttrInfo> updateWrapper = new UpdateWrapper<>();
            updateWrapper.eq("id",id);

            //跟新商品的info
            attrInfoMapper.update(pmsBaseAttrInfo,updateWrapper);

            //因为前端教学模板的问题所以在更新数据以前应该先删除那些原有的数据（因为前端没有写具体的删除请求）

            QueryWrapper<PmsBaseAttrValue> delWrapper = new QueryWrapper<PmsBaseAttrValue>();
            delWrapper.eq("attr_id",id);
            attrValueMapper.delete(delWrapper);

            //跟新商品info对应的value
            for (PmsBaseAttrValue pmsBaseAttrValue : attrValueList) {
                //判断是否有新的属性值添加
                //System.out.println(pmsBaseAttrValue.getId());
                /*if (0 == pmsBaseAttrValue.getId()){*/
                    pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                    attrValueMapper.insert(pmsBaseAttrValue);
                /*}else {
                    attrValueMapper.updateById(pmsBaseAttrValue);
                }*/
            }

        }

        return "success";
    }
}
