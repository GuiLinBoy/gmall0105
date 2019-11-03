package com.guilin.gmall.bean;

import javax.persistence.*;

@Entity
@Table(name = "pms_sku_image", schema = "gmall_study", catalog = "")
public class PmsSkuImage {
    private long id;
    private Long skuId;
    private String imgName;
    private String imgUrl;
    private Long productImgId;
    private String isDefault;

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
    @Column(name = "img_name", nullable = true, length = 200)
    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    @Basic
    @Column(name = "img_url", nullable = true, length = 200)
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Basic
    @Column(name = "product_img_id", nullable = true)
    public Long getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(Long productImgId) {
        this.productImgId = productImgId;
    }

    @Basic
    @Column(name = "is_default", nullable = true, length = 4000)
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsSkuImage that = (PmsSkuImage) o;

        if (id != that.id) return false;
        if (skuId != null ? !skuId.equals(that.skuId) : that.skuId != null) return false;
        if (imgName != null ? !imgName.equals(that.imgName) : that.imgName != null) return false;
        if (imgUrl != null ? !imgUrl.equals(that.imgUrl) : that.imgUrl != null) return false;
        if (productImgId != null ? !productImgId.equals(that.productImgId) : that.productImgId != null) return false;
        if (isDefault != null ? !isDefault.equals(that.isDefault) : that.isDefault != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (skuId != null ? skuId.hashCode() : 0);
        result = 31 * result + (imgName != null ? imgName.hashCode() : 0);
        result = 31 * result + (imgUrl != null ? imgUrl.hashCode() : 0);
        result = 31 * result + (productImgId != null ? productImgId.hashCode() : 0);
        result = 31 * result + (isDefault != null ? isDefault.hashCode() : 0);
        return result;
    }
}
