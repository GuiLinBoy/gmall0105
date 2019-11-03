package com.guilin.gmall.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guilin.gmall.bean.PmsBaseAttrInfo;
import com.guilin.gmall.bean.PmsBaseAttrValue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;



import java.util.List;
@Mapper
public interface AttrInfoMapper extends BaseMapper<PmsBaseAttrInfo> {

    //根据三级目录的id查询出对应的属性列表

    @Select("select * from pms_base_attr_info where catalog3_id=#{catalog3Id}")
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    //根据商品的属性的id查询对应的value的list
    @Select("select * from pms_base_attr_value where attr_id=#{attrId}")
    public List<PmsBaseAttrValue> getAttrValueList(int attrId);



}
