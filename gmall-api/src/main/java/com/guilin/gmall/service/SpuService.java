package com.guilin.gmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guilin.gmall.bean.PmsProductInfo;

import java.util.List;

public interface SpuService extends IService<PmsProductInfo>{

    //根据三级目录获取商品的Spu的信息（该商品的所有信息）
    List<PmsProductInfo> spuList(String catalog3Id);
}
