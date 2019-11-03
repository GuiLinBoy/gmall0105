package com.guilin.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pms_product_info", schema = "gmall_study")
public class PmsProductInfo implements Serializable {
    private long id;
    private String productName;
    private String description;
    private Long catalog3Id;
    private Long tmId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_name", nullable = true, length = 200)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 1000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "catalog3_id", nullable = true)
    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    @Basic
    @Column(name = "tm_id", nullable = true)
    public Long getTmId() {
        return tmId;
    }

    public void setTmId(Long tmId) {
        this.tmId = tmId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsProductInfo that = (PmsProductInfo) o;

        if (id != that.id) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (catalog3Id != null ? !catalog3Id.equals(that.catalog3Id) : that.catalog3Id != null) return false;
        if (tmId != null ? !tmId.equals(that.tmId) : that.tmId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (catalog3Id != null ? catalog3Id.hashCode() : 0);
        result = 31 * result + (tmId != null ? tmId.hashCode() : 0);
        return result;
    }
}
