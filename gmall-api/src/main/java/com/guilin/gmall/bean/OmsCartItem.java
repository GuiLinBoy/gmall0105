package com.guilin.gmall.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "oms_cart_item", schema = "gmall_study")
public class OmsCartItem {
    private long id;
    private Long productId;
    private Long productSkuId;
    private Long memberId;
    private Integer quantity;
    private BigDecimal price;
    private String sp1;
    private String sp2;
    private String sp3;
    private String productPic;
    private String productName;
    private String productSubTitle;
    private String productSkuCode;
    private String memberNickname;
    private Timestamp createDate;
    private Timestamp modifyDate;
    private Integer deleteStatus;
    private Long productCategoryId;
    private String productBrand;
    private String productSn;
    private String productAttr;

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
    @Column(name = "product_sku_id", nullable = true)
    public Long getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    @Basic
    @Column(name = "member_id", nullable = true)
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "quantity", nullable = true)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "sp1", nullable = true, length = 200)
    public String getSp1() {
        return sp1;
    }

    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    @Basic
    @Column(name = "sp2", nullable = true, length = 200)
    public String getSp2() {
        return sp2;
    }

    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    @Basic
    @Column(name = "sp3", nullable = true, length = 200)
    public String getSp3() {
        return sp3;
    }

    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    @Basic
    @Column(name = "product_pic", nullable = true, length = 1000)
    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    @Basic
    @Column(name = "product_name", nullable = true, length = 500)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_sub_title", nullable = true, length = 500)
    public String getProductSubTitle() {
        return productSubTitle;
    }

    public void setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle;
    }

    @Basic
    @Column(name = "product_sku_code", nullable = true, length = 200)
    public String getProductSkuCode() {
        return productSkuCode;
    }

    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    @Basic
    @Column(name = "member_nickname", nullable = true, length = 500)
    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    @Basic
    @Column(name = "create_date", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "modify_date", nullable = true)
    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Column(name = "delete_status", nullable = true)
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Basic
    @Column(name = "product_category_id", nullable = true)
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Basic
    @Column(name = "product_brand", nullable = true, length = 200)
    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    @Basic
    @Column(name = "product_sn", nullable = true, length = 200)
    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    @Basic
    @Column(name = "product_attr", nullable = true, length = 500)
    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OmsCartItem that = (OmsCartItem) o;

        if (id != that.id) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (productSkuId != null ? !productSkuId.equals(that.productSkuId) : that.productSkuId != null) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (sp1 != null ? !sp1.equals(that.sp1) : that.sp1 != null) return false;
        if (sp2 != null ? !sp2.equals(that.sp2) : that.sp2 != null) return false;
        if (sp3 != null ? !sp3.equals(that.sp3) : that.sp3 != null) return false;
        if (productPic != null ? !productPic.equals(that.productPic) : that.productPic != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productSubTitle != null ? !productSubTitle.equals(that.productSubTitle) : that.productSubTitle != null)
            return false;
        if (productSkuCode != null ? !productSkuCode.equals(that.productSkuCode) : that.productSkuCode != null)
            return false;
        if (memberNickname != null ? !memberNickname.equals(that.memberNickname) : that.memberNickname != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (deleteStatus != null ? !deleteStatus.equals(that.deleteStatus) : that.deleteStatus != null) return false;
        if (productCategoryId != null ? !productCategoryId.equals(that.productCategoryId) : that.productCategoryId != null)
            return false;
        if (productBrand != null ? !productBrand.equals(that.productBrand) : that.productBrand != null) return false;
        if (productSn != null ? !productSn.equals(that.productSn) : that.productSn != null) return false;
        if (productAttr != null ? !productAttr.equals(that.productAttr) : that.productAttr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (productSkuId != null ? productSkuId.hashCode() : 0);
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (sp1 != null ? sp1.hashCode() : 0);
        result = 31 * result + (sp2 != null ? sp2.hashCode() : 0);
        result = 31 * result + (sp3 != null ? sp3.hashCode() : 0);
        result = 31 * result + (productPic != null ? productPic.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productSubTitle != null ? productSubTitle.hashCode() : 0);
        result = 31 * result + (productSkuCode != null ? productSkuCode.hashCode() : 0);
        result = 31 * result + (memberNickname != null ? memberNickname.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (deleteStatus != null ? deleteStatus.hashCode() : 0);
        result = 31 * result + (productCategoryId != null ? productCategoryId.hashCode() : 0);
        result = 31 * result + (productBrand != null ? productBrand.hashCode() : 0);
        result = 31 * result + (productSn != null ? productSn.hashCode() : 0);
        result = 31 * result + (productAttr != null ? productAttr.hashCode() : 0);
        return result;
    }
}
