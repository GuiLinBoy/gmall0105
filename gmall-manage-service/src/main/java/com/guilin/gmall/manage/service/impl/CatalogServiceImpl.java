package com.guilin.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.guilin.gmall.bean.PmsBaseCatalog1;
import com.guilin.gmall.bean.PmsBaseCatalog2;
import com.guilin.gmall.bean.PmsBaseCatalog3;
import com.guilin.gmall.manage.mapper.CatalogMapper;
import com.guilin.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    CatalogMapper catalogMapper;


    //根据二级目录的id查找三级目录的数据
    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {

        List<PmsBaseCatalog3> catalog3 = catalogMapper.getCatalog3(catalog2Id);
        return catalog3;
    }

    //查找二级目录的数据
    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {

        List<PmsBaseCatalog2> catalog2 = catalogMapper.getCatalog2(catalog1Id);

        return catalog2;
    }


    //查找一级目录数据
    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> catalog1EntityList = catalogMapper.getCatalog1();
        return catalog1EntityList;
    }
}
