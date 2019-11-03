package com.guilin.gmall.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "oms_order", schema = "gmall_study", catalog = "")
public class OmsOrder {
    private long id;
    private long memberId;
    private Long couponId;
    private String orderSn;
    private Timestamp createTime;
    private String memberUsername;
    private BigDecimal totalAmount;
    private BigDecimal payAmount;
    private BigDecimal freightAmount;
    private BigDecimal promotionAmount;
    private BigDecimal integrationAmount;
    private BigDecimal couponAmount;
    private BigDecimal discountAmount;
    private Integer payType;
    private Integer sourceType;
    private Integer status;
    private Integer orderType;
    private String deliveryCompany;
    private String deliverySn;
    private Integer autoConfirmDay;
    private Integer integration;
    private Integer growth;
    private String promotionInfo;
    private Integer billType;
    private String billHeader;
    private String billContent;
    private String billReceiverPhone;
    private String billReceiverEmail;
    private String receiverName;
    private String receiverPhone;
    private String receiverPostCode;
    private String receiverProvince;
    private String receiverCity;
    private String receiverRegion;
    private String receiverDetailAddress;
    private String note;
    private Integer confirmStatus;
    private int deleteStatus;
    private Integer useIntegration;
    private Timestamp paymentTime;
    private Timestamp deliveryTime;
    private Timestamp receiveTime;
    private Timestamp commentTime;
    private Timestamp modifyTime;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "member_id", nullable = false)
    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "coupon_id", nullable = true)
    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
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
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "member_username", nullable = true, length = 64)
    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    @Basic
    @Column(name = "total_amount", nullable = true, precision = 2)
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Basic
    @Column(name = "pay_amount", nullable = true, precision = 2)
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    @Basic
    @Column(name = "freight_amount", nullable = true, precision = 2)
    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
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
    @Column(name = "integration_amount", nullable = true, precision = 2)
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
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
    @Column(name = "discount_amount", nullable = true, precision = 2)
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Basic
    @Column(name = "pay_type", nullable = true)
    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    @Basic
    @Column(name = "source_type", nullable = true)
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "order_type", nullable = true)
    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    @Basic
    @Column(name = "delivery_company", nullable = true, length = 64)
    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    @Basic
    @Column(name = "delivery_sn", nullable = true, length = 64)
    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn;
    }

    @Basic
    @Column(name = "auto_confirm_day", nullable = true)
    public Integer getAutoConfirmDay() {
        return autoConfirmDay;
    }

    public void setAutoConfirmDay(Integer autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }

    @Basic
    @Column(name = "integration", nullable = true)
    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    @Basic
    @Column(name = "growth", nullable = true)
    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    @Basic
    @Column(name = "promotion_info", nullable = true, length = 100)
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    @Basic
    @Column(name = "bill_type", nullable = true)
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    @Basic
    @Column(name = "bill_header", nullable = true, length = 200)
    public String getBillHeader() {
        return billHeader;
    }

    public void setBillHeader(String billHeader) {
        this.billHeader = billHeader;
    }

    @Basic
    @Column(name = "bill_content", nullable = true, length = 200)
    public String getBillContent() {
        return billContent;
    }

    public void setBillContent(String billContent) {
        this.billContent = billContent;
    }

    @Basic
    @Column(name = "bill_receiver_phone", nullable = true, length = 32)
    public String getBillReceiverPhone() {
        return billReceiverPhone;
    }

    public void setBillReceiverPhone(String billReceiverPhone) {
        this.billReceiverPhone = billReceiverPhone;
    }

    @Basic
    @Column(name = "bill_receiver_email", nullable = true, length = 64)
    public String getBillReceiverEmail() {
        return billReceiverEmail;
    }

    public void setBillReceiverEmail(String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail;
    }

    @Basic
    @Column(name = "receiver_name", nullable = false, length = 100)
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Basic
    @Column(name = "receiver_phone", nullable = false, length = 32)
    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    @Basic
    @Column(name = "receiver_post_code", nullable = true, length = 32)
    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    @Basic
    @Column(name = "receiver_province", nullable = true, length = 32)
    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    @Basic
    @Column(name = "receiver_city", nullable = true, length = 32)
    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    @Basic
    @Column(name = "receiver_region", nullable = true, length = 32)
    public String getReceiverRegion() {
        return receiverRegion;
    }

    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion;
    }

    @Basic
    @Column(name = "receiver_detail_address", nullable = true, length = 200)
    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress;
    }

    @Basic
    @Column(name = "note", nullable = true, length = 500)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "confirm_status", nullable = true)
    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    @Basic
    @Column(name = "delete_status", nullable = false)
    public int getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(int deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Basic
    @Column(name = "use_integration", nullable = true)
    public Integer getUseIntegration() {
        return useIntegration;
    }

    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }

    @Basic
    @Column(name = "payment_time", nullable = true)
    public Timestamp getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Timestamp paymentTime) {
        this.paymentTime = paymentTime;
    }

    @Basic
    @Column(name = "delivery_time", nullable = true)
    public Timestamp getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Timestamp deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Basic
    @Column(name = "receive_time", nullable = true)
    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Basic
    @Column(name = "comment_time", nullable = true)
    public Timestamp getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Timestamp commentTime) {
        this.commentTime = commentTime;
    }

    @Basic
    @Column(name = "modify_time", nullable = true)
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OmsOrder that = (OmsOrder) o;

        if (id != that.id) return false;
        if (memberId != that.memberId) return false;
        if (deleteStatus != that.deleteStatus) return false;
        if (couponId != null ? !couponId.equals(that.couponId) : that.couponId != null) return false;
        if (orderSn != null ? !orderSn.equals(that.orderSn) : that.orderSn != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (memberUsername != null ? !memberUsername.equals(that.memberUsername) : that.memberUsername != null)
            return false;
        if (totalAmount != null ? !totalAmount.equals(that.totalAmount) : that.totalAmount != null) return false;
        if (payAmount != null ? !payAmount.equals(that.payAmount) : that.payAmount != null) return false;
        if (freightAmount != null ? !freightAmount.equals(that.freightAmount) : that.freightAmount != null)
            return false;
        if (promotionAmount != null ? !promotionAmount.equals(that.promotionAmount) : that.promotionAmount != null)
            return false;
        if (integrationAmount != null ? !integrationAmount.equals(that.integrationAmount) : that.integrationAmount != null)
            return false;
        if (couponAmount != null ? !couponAmount.equals(that.couponAmount) : that.couponAmount != null) return false;
        if (discountAmount != null ? !discountAmount.equals(that.discountAmount) : that.discountAmount != null)
            return false;
        if (payType != null ? !payType.equals(that.payType) : that.payType != null) return false;
        if (sourceType != null ? !sourceType.equals(that.sourceType) : that.sourceType != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (orderType != null ? !orderType.equals(that.orderType) : that.orderType != null) return false;
        if (deliveryCompany != null ? !deliveryCompany.equals(that.deliveryCompany) : that.deliveryCompany != null)
            return false;
        if (deliverySn != null ? !deliverySn.equals(that.deliverySn) : that.deliverySn != null) return false;
        if (autoConfirmDay != null ? !autoConfirmDay.equals(that.autoConfirmDay) : that.autoConfirmDay != null)
            return false;
        if (integration != null ? !integration.equals(that.integration) : that.integration != null) return false;
        if (growth != null ? !growth.equals(that.growth) : that.growth != null) return false;
        if (promotionInfo != null ? !promotionInfo.equals(that.promotionInfo) : that.promotionInfo != null)
            return false;
        if (billType != null ? !billType.equals(that.billType) : that.billType != null) return false;
        if (billHeader != null ? !billHeader.equals(that.billHeader) : that.billHeader != null) return false;
        if (billContent != null ? !billContent.equals(that.billContent) : that.billContent != null) return false;
        if (billReceiverPhone != null ? !billReceiverPhone.equals(that.billReceiverPhone) : that.billReceiverPhone != null)
            return false;
        if (billReceiverEmail != null ? !billReceiverEmail.equals(that.billReceiverEmail) : that.billReceiverEmail != null)
            return false;
        if (receiverName != null ? !receiverName.equals(that.receiverName) : that.receiverName != null) return false;
        if (receiverPhone != null ? !receiverPhone.equals(that.receiverPhone) : that.receiverPhone != null)
            return false;
        if (receiverPostCode != null ? !receiverPostCode.equals(that.receiverPostCode) : that.receiverPostCode != null)
            return false;
        if (receiverProvince != null ? !receiverProvince.equals(that.receiverProvince) : that.receiverProvince != null)
            return false;
        if (receiverCity != null ? !receiverCity.equals(that.receiverCity) : that.receiverCity != null) return false;
        if (receiverRegion != null ? !receiverRegion.equals(that.receiverRegion) : that.receiverRegion != null)
            return false;
        if (receiverDetailAddress != null ? !receiverDetailAddress.equals(that.receiverDetailAddress) : that.receiverDetailAddress != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (confirmStatus != null ? !confirmStatus.equals(that.confirmStatus) : that.confirmStatus != null)
            return false;
        if (useIntegration != null ? !useIntegration.equals(that.useIntegration) : that.useIntegration != null)
            return false;
        if (paymentTime != null ? !paymentTime.equals(that.paymentTime) : that.paymentTime != null) return false;
        if (deliveryTime != null ? !deliveryTime.equals(that.deliveryTime) : that.deliveryTime != null) return false;
        if (receiveTime != null ? !receiveTime.equals(that.receiveTime) : that.receiveTime != null) return false;
        if (commentTime != null ? !commentTime.equals(that.commentTime) : that.commentTime != null) return false;
        if (modifyTime != null ? !modifyTime.equals(that.modifyTime) : that.modifyTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (memberId ^ (memberId >>> 32));
        result = 31 * result + (couponId != null ? couponId.hashCode() : 0);
        result = 31 * result + (orderSn != null ? orderSn.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (memberUsername != null ? memberUsername.hashCode() : 0);
        result = 31 * result + (totalAmount != null ? totalAmount.hashCode() : 0);
        result = 31 * result + (payAmount != null ? payAmount.hashCode() : 0);
        result = 31 * result + (freightAmount != null ? freightAmount.hashCode() : 0);
        result = 31 * result + (promotionAmount != null ? promotionAmount.hashCode() : 0);
        result = 31 * result + (integrationAmount != null ? integrationAmount.hashCode() : 0);
        result = 31 * result + (couponAmount != null ? couponAmount.hashCode() : 0);
        result = 31 * result + (discountAmount != null ? discountAmount.hashCode() : 0);
        result = 31 * result + (payType != null ? payType.hashCode() : 0);
        result = 31 * result + (sourceType != null ? sourceType.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (orderType != null ? orderType.hashCode() : 0);
        result = 31 * result + (deliveryCompany != null ? deliveryCompany.hashCode() : 0);
        result = 31 * result + (deliverySn != null ? deliverySn.hashCode() : 0);
        result = 31 * result + (autoConfirmDay != null ? autoConfirmDay.hashCode() : 0);
        result = 31 * result + (integration != null ? integration.hashCode() : 0);
        result = 31 * result + (growth != null ? growth.hashCode() : 0);
        result = 31 * result + (promotionInfo != null ? promotionInfo.hashCode() : 0);
        result = 31 * result + (billType != null ? billType.hashCode() : 0);
        result = 31 * result + (billHeader != null ? billHeader.hashCode() : 0);
        result = 31 * result + (billContent != null ? billContent.hashCode() : 0);
        result = 31 * result + (billReceiverPhone != null ? billReceiverPhone.hashCode() : 0);
        result = 31 * result + (billReceiverEmail != null ? billReceiverEmail.hashCode() : 0);
        result = 31 * result + (receiverName != null ? receiverName.hashCode() : 0);
        result = 31 * result + (receiverPhone != null ? receiverPhone.hashCode() : 0);
        result = 31 * result + (receiverPostCode != null ? receiverPostCode.hashCode() : 0);
        result = 31 * result + (receiverProvince != null ? receiverProvince.hashCode() : 0);
        result = 31 * result + (receiverCity != null ? receiverCity.hashCode() : 0);
        result = 31 * result + (receiverRegion != null ? receiverRegion.hashCode() : 0);
        result = 31 * result + (receiverDetailAddress != null ? receiverDetailAddress.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (confirmStatus != null ? confirmStatus.hashCode() : 0);
        result = 31 * result + deleteStatus;
        result = 31 * result + (useIntegration != null ? useIntegration.hashCode() : 0);
        result = 31 * result + (paymentTime != null ? paymentTime.hashCode() : 0);
        result = 31 * result + (deliveryTime != null ? deliveryTime.hashCode() : 0);
        result = 31 * result + (receiveTime != null ? receiveTime.hashCode() : 0);
        result = 31 * result + (commentTime != null ? commentTime.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        return result;
    }
}
