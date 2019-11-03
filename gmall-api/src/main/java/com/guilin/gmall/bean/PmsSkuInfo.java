package com.guilin.gmall.bean;

import javax.persistence.*;

@Entity
@Table(name = "pms_sku_info", schema = "gmall_study")
public class PmsSkuInfo {
    private long id;
    private Long productId;
    private Double price;
    private String skuName;
    private String skuDesc;
    private Double weight;
    private Long tmId;
    private Long catalog3Id;
    private String skuDefaultImg;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_id", nullable = true)
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "sku_name", nullable = true, length = 200)
    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    @Basic
    @Column(name = "sku_desc", nullable = true, length = 2000)
    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    @Basic
    @Column(name = "weight", nullable = true, precision = 0)
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "tm_id", nullable = true)
    public Long getTmId() {
        return tmId;
    }

    public void setTmId(Long tmId) {
        this.tmId = tmId;
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
    @Column(name = "sku_default_img", nullable = true, length = 200)
    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsSkuInfo that = (PmsSkuInfo) o;

        if (id != that.id) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (skuName != null ? !skuName.equals(that.skuName) : that.skuName != null) return false;
        if (skuDesc != null ? !skuDesc.equals(that.skuDesc) : that.skuDesc != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (tmId != null ? !tmId.equals(that.tmId) : that.tmId != null) return false;
        if (catalog3Id != null ? !catalog3Id.equals(that.catalog3Id) : that.catalog3Id != null) return false;
        if (skuDefaultImg != null ? !skuDefaultImg.equals(that.skuDefaultImg) : that.skuDefaultImg != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (skuName != null ? skuName.hashCode() : 0);
        result = 31 * result + (skuDesc != null ? skuDesc.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (tmId != null ? tmId.hashCode() : 0);
        result = 31 * result + (catalog3Id != null ? catalog3Id.hashCode() : 0);
        result = 31 * result + (skuDefaultImg != null ? skuDefaultImg.hashCode() : 0);
        return result;
    }
}
