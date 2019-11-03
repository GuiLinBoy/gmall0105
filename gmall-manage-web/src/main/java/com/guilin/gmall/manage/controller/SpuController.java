package com.guilin.gmall.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.guilin.gmall.bean.PmsProductInfo;
import com.guilin.gmall.service.SpuService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class SpuController {

    @Reference
    SpuService spuService;


    //上传图片的方法



    @RequestMapping("/spuList")
    public List<PmsProductInfo> spuList(String catalog3Id){

        List<PmsProductInfo> pmsProductInfos = spuService.spuList(catalog3Id);

        return pmsProductInfos;
    }


}
