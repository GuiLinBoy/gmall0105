package com.guilin.gmall.bean;

import javax.persistence.*;

@Entity
@Table(name = "pms_sku_sale_attr_value", schema = "gmall_study", catalog = "")
public class PmsSkuSaleAttrValue {
    private long id;
    private Long skuId;
    private Long saleAttrId;
    private Long saleAttrValueId;
    private String saleAttrName;
    private String saleAttrValueName;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sku_id", nullable = true)
    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    @Basic
    @Column(name = "sale_attr_id", nullable = true)
    public Long getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(Long saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    @Basic
    @Column(name = "sale_attr_value_id", nullable = true)
    public Long getSaleAttrValueId() {
        return saleAttrValueId;
    }

    public void setSaleAttrValueId(Long saleAttrValueId) {
        this.saleAttrValueId = saleAttrValueId;
    }

    @Basic
    @Column(name = "sale_attr_name", nullable = true, length = 20)
    public String getSaleAttrName() {
        return saleAttrName;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    @Basic
    @Column(name = "sale_attr_value_name", nullable = true, length = 20)
    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsSkuSaleAttrValue that = (PmsSkuSaleAttrValue) o;

        if (id != that.id) return false;
        if (skuId != null ? !skuId.equals(that.skuId) : that.skuId != null) return false;
        if (saleAttrId != null ? !saleAttrId.equals(that.saleAttrId) : that.saleAttrId != null) return false;
        if (saleAttrValueId != null ? !saleAttrValueId.equals(that.saleAttrValueId) : that.saleAttrValueId != null)
            return false;
        if (saleAttrName != null ? !saleAttrName.equals(that.saleAttrName) : that.saleAttrName != null) return false;
        if (saleAttrValueName != null ? !saleAttrValueName.equals(that.saleAttrValueName) : that.saleAttrValueName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (skuId != null ? skuId.hashCode() : 0);
        result = 31 * result + (saleAttrId != null ? saleAttrId.hashCode() : 0);
        result = 31 * result + (saleAttrValueId != null ? saleAttrValueId.hashCode() : 0);
        result = 31 * result + (saleAttrName != null ? saleAttrName.hashCode() : 0);
        result = 31 * result + (saleAttrValueName != null ? saleAttrValueName.hashCode() : 0);
        return result;
    }
}
