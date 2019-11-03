package com.guilin.gmall.service;

import com.guilin.gmall.bean.PmsBaseAttrInfo;
import com.guilin.gmall.bean.PmsBaseAttrValue;

import java.util.List;

public interface AttrService {

    //根据商品的三级目录来查询对应的属性列表
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);
    //根据属性的id查询对应的value的列表
    List<PmsBaseAttrValue> getAttrValueList(int attrId);
    //保存和更新属性以及属性对应的值
    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);
}
