package com.guilin.gmall.bean;

import javax.persistence.*;

@Entity
@Table(name = "pms_product_sale_attr", schema = "gmall_study", catalog = "")
public class PmsProductSaleAttr {
    private long id;
    private Long productId;
    private Long saleAttrId;
    private String saleAttrName;

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
    @Column(name = "sale_attr_id", nullable = true)
    public Long getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(Long saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    @Basic
    @Column(name = "sale_attr_name", nullable = true, length = 20)
    public String getSaleAttrName() {
        return saleAttrName;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsProductSaleAttr that = (PmsProductSaleAttr) o;

        if (id != that.id) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (saleAttrId != null ? !saleAttrId.equals(that.saleAttrId) : that.saleAttrId != null) return false;
        if (saleAttrName != null ? !saleAttrName.equals(that.saleAttrName) : that.saleAttrName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (saleAttrId != null ? saleAttrId.hashCode() : 0);
        result = 31 * result + (saleAttrName != null ? saleAttrName.hashCode() : 0);
        return result;
    }
}
