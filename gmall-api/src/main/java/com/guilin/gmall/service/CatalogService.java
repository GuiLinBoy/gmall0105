package com.guilin.gmall.service;

import com.guilin.gmall.bean.PmsBaseCatalog1;
import com.guilin.gmall.bean.PmsBaseCatalog2;
import com.guilin.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {

    //查找一级目录
    List<PmsBaseCatalog1> getCatalog1();
    //根据一级目录的id查找二级目录
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);
    //根据二级目录的id查找三级目录
    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
