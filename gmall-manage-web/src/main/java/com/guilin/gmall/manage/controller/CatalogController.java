package com.guilin.gmall.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.guilin.gmall.bean.PmsBaseCatalog1;
import com.guilin.gmall.bean.PmsBaseCatalog2;
import com.guilin.gmall.bean.PmsBaseCatalog3;
import com.guilin.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class CatalogController {

    @Reference
    CatalogService catalogService;

    //一级目录
    @RequestMapping("/getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){

        //获取平台属性
        List<PmsBaseCatalog1>  catalog1 = catalogService.getCatalog1();

        return catalog1;

    }

    //二级目录（根据一级目录的id到二级目录表中查询）
    @ResponseBody
    @RequestMapping("/getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){

        //根据id获取
        List<PmsBaseCatalog2> catalog2 = catalogService.getCatalog2(catalog1Id);
        return catalog2;
    }

    //根据二级目录的id查询对应的三级目录的数据
    @ResponseBody
    @RequestMapping("/getCatalog3")
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        List<PmsBaseCatalog3> catalog3 = catalogService.getCatalog3(catalog2Id);

        return catalog3;
    }



}
