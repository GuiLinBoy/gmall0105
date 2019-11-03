package com.guilin.gmall.manage.mapper;


import com.guilin.gmall.bean.PmsBaseCatalog1;
import com.guilin.gmall.bean.PmsBaseCatalog2;
import com.guilin.gmall.bean.PmsBaseCatalog3;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CatalogMapper {

    //实现查找一级目录
    @Select("select * from pms_base_catalog1")
    public List<PmsBaseCatalog1> getCatalog1();

    //根据一级目录的id查找对应的二级目录
    @Select("select * from pms_base_catalog2 where catalog1_id=#{catalog1Id}")
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    //根据二级目录的id查询对应的三级目录
    @Select("select * from pms_base_catalog3 where catalog2_id=#{catalog2Id}")
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id);


}
