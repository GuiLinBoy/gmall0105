package com.guilin.gmall.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.guilin.gmall.bean.PmsBaseAttrInfo;
import com.guilin.gmall.bean.PmsBaseAttrValue;
import com.guilin.gmall.service.AttrService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin //跨域请求
public class AttrController  {

    //注入服务端口
    @Reference
    AttrService attrService;

    //根据三级目录的id查询对应的属性列表
    @RequestMapping("/attrInfoList")
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> attrInfo = attrService.attrInfoList(catalog3Id);
        return attrInfo;
    }


    //根据属性的id查询属性的值的列表
    @RequestMapping("/getAttrValueList")
    public List<PmsBaseAttrValue> getAttrValueList(int attrId){
        System.out.println(attrId);
        List<PmsBaseAttrValue> attrValue = attrService.getAttrValueList(attrId);
        return attrValue;
    }


    //保存属性的属性值
    @RequestMapping("/saveAttrInfo")
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){

        //处理数据
        String str = attrService.saveAttrInfo(pmsBaseAttrInfo);

        return str;
    }

}
