package com.guilin.gmall.bean;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "oms_order_item", schema = "gmall_study", catalog = "")
public class OmsOrderItem {
    private long id;
    private Long orderId;
    private String orderSn;
    private Long productId;
    private String productPic;
    private String productName;
    private String productBrand;
    private String productSn;
    private BigDecimal productPrice;
    private Integer productQuantity;
    private Long productSkuId;
    private String productSkuCode;
    private Long productCategoryId;
    private String sp1;
    private String sp2;
    private String sp3;
    private String promotionName;
    private BigDecimal promotionAmount;
    private BigDecimal couponAmount;
    private BigDecimal integrationAmount;
    private BigDecimal realAmount;
    private Integer giftIntegration;
    private Integer giftGrowth;
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
    @Column(name = "order_id", nullable = true)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "order_sn", nullable = true, length = 64)
    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
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
    @Column(name = "product_pic", nullable = true, length = 500)
    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
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
    @Column(name = "product_brand", nullable = true, length = 200)
    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    @Basic
    @Column(name = "product_sn", nullable = true, length = 64)
    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    @Basic
    @Column(name = "product_price", nullable = true, precision = 2)
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    @Basic
    @Column(name = "product_quantity", nullable = true)
    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
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
    @Column(name = "product_sku_code", nullable = true, length = 50)
    public String getProductSkuCode() {
        return productSkuCode;
    }

    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
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
    @Column(name = "sp1", nullable = true, length = 100)
    public String getSp1() {
        return sp1;
    }

    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    @Basic
    @Column(name = "sp2", nullable = true, length = 100)
    public String getSp2() {
        return sp2;
    }

    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    @Basic
    @Column(name = "sp3", nullable = true, length = 100)
    public String getSp3() {
        return sp3;
    }

    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    @Basic
    @Column(name = "promotion_name", nullable = true, length = 200)
    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    @Basic
    @Column(name = "promotion_amount", nullable = true, precision = 2)
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    @Basic
    @Column(name = "coupon_amount", nullable = true, precision = 2)
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    @Basic
    @Column(name = "integration_amount", nullable = true, precision = 2)
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    @Basic
    @Column(name = "real_amount", nullable = true, precision = 2)
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    @Basic
    @Column(name = "gift_integration", nullable = true)
    public Integer getGiftIntegration() {
        return giftIntegration;
    }

    public void setGiftIntegration(Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    @Basic
    @Column(name = "gift_growth", nullable = true)
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
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

        OmsOrderItem that = (OmsOrderItem) o;

        if (id != that.id) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (orderSn != null ? !orderSn.equals(that.orderSn) : that.orderSn != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (productPic != null ? !productPic.equals(that.productPic) : that.productPic != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productBrand != null ? !productBrand.equals(that.productBrand) : that.productBrand != null) return false;
        if (productSn != null ? !productSn.equals(that.productSn) : that.productSn != null) return false;
        if (productPrice != null ? !productPrice.equals(that.productPrice) : that.productPrice != null) return false;
        if (productQuantity != null ? !productQuantity.equals(that.productQuantity) : that.productQuantity != null)
            return false;
        if (productSkuId != null ? !productSkuId.equals(that.productSkuId) : that.productSkuId != null) return false;
        if (productSkuCode != null ? !productSkuCode.equals(that.productSkuCode) : that.productSkuCode != null)
            return false;
        if (productCategoryId != null ? !productCategoryId.equals(that.productCategoryId) : that.productCategoryId != null)
            return false;
        if (sp1 != null ? !sp1.equals(that.sp1) : that.sp1 != null) return false;
        if (sp2 != null ? !sp2.equals(that.sp2) : that.sp2 != null) return false;
        if (sp3 != null ? !sp3.equals(that.sp3) : that.sp3 != null) return false;
        if (promotionName != null ? !promotionName.equals(that.promotionName) : that.promotionName != null)
            return false;
        if (promotionAmount != null ? !promotionAmount.equals(that.promotionAmount) : that.promotionAmount != null)
            return false;
        if (couponAmount != null ? !couponAmount.equals(that.couponAmount) : that.couponAmount != null) return false;
        if (integrationAmount != null ? !integrationAmount.equals(that.integrationAmount) : that.integrationAmount != null)
            return false;
        if (realAmount != null ? !realAmount.equals(that.realAmount) : that.realAmount != null) return false;
        if (giftIntegration != null ? !giftIntegration.equals(that.giftIntegration) : that.giftIntegration != null)
            return false;
        if (giftGrowth != null ? !giftGrowth.equals(that.giftGrowth) : that.giftGrowth != null) return false;
        if (productAttr != null ? !productAttr.equals(that.productAttr) : that.productAttr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (orderSn != null ? orderSn.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (productPic != null ? productPic.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productBrand != null ? productBrand.hashCode() : 0);
        result = 31 * result + (productSn != null ? productSn.hashCode() : 0);
        result = 31 * result + (productPrice != null ? productPrice.hashCode() : 0);
        result = 31 * result + (productQuantity != null ? productQuantity.hashCode() : 0);
        result = 31 * result + (productSkuId != null ? productSkuId.hashCode() : 0);
        result = 31 * result + (productSkuCode != null ? productSkuCode.hashCode() : 0);
        result = 31 * result + (productCategoryId != null ? productCategoryId.hashCode() : 0);
        result = 31 * result + (sp1 != null ? sp1.hashCode() : 0);
        result = 31 * result + (sp2 != null ? sp2.hashCode() : 0);
        result = 31 * result + (sp3 != null ? sp3.hashCode() : 0);
        result = 31 * result + (promotionName != null ? promotionName.hashCode() : 0);
        result = 31 * result + (promotionAmount != null ? promotionAmount.hashCode() : 0);
        result = 31 * result + (couponAmount != null ? couponAmount.hashCode() : 0);
        result = 31 * result + (integrationAmount != null ? integrationAmount.hashCode() : 0);
        result = 31 * result + (realAmount != null ? realAmount.hashCode() : 0);
        result = 31 * result + (giftIntegration != null ? giftIntegration.hashCode() : 0);
        result = 31 * result + (giftGrowth != null ? giftGrowth.hashCode() : 0);
        result = 31 * result + (productAttr != null ? productAttr.hashCode() : 0);
        return result;
    }
}
