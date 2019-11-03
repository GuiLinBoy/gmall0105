package com.guilin.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guilin.gmall.bean.PmsProductInfo;
import com.guilin.gmall.manage.mapper.ProductInfoMapper;
import com.guilin.gmall.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class SpuServiceImpl extends ServiceImpl<ProductInfoMapper,PmsProductInfo> implements SpuService {

    @Autowired
    ProductInfoMapper productInfoMapper;

    @Override
    public List<PmsProductInfo> spuList(String catalog3Id) {

        //定义查询的规则
        QueryWrapper<PmsProductInfo> queryWrapper = new QueryWrapper<>();
         queryWrapper.eq(false,"catalog3_id",catalog3Id);
        //查询
        List<PmsProductInfo> pmsProductInfos = productInfoMapper.selectList(queryWrapper);

        return pmsProductInfos;
    }
}
