package com.guilin.gmall.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "payment_info", schema = "gmall_study", catalog = "")
public class PaymentInfo {
    private long id;
    private String orderSn;
    private String orderId;
    private String alipayTradeNo;
    private BigDecimal totalAmount;
    private String subject;
    private String paymentStatus;
    private Timestamp createTime;
    private Timestamp confirmTime;
    private String callbackContent;
    private Timestamp callbackTime;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_sn", nullable = true, length = 255)
    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    @Basic
    @Column(name = "order_id", nullable = true, length = 50)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "alipay_trade_no", nullable = true, length = 50)
    public String getAlipayTradeNo() {
        return alipayTradeNo;
    }

    public void setAlipayTradeNo(String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
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
    @Column(name = "subject", nullable = true, length = 200)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "payment_status", nullable = true, length = 20)
    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
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
    @Column(name = "confirm_time", nullable = true)
    public Timestamp getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Timestamp confirmTime) {
        this.confirmTime = confirmTime;
    }

    @Basic
    @Column(name = "callback_content", nullable = true, length = 4000)
    public String getCallbackContent() {
        return callbackContent;
    }

    public void setCallbackContent(String callbackContent) {
        this.callbackContent = callbackContent;
    }

    @Basic
    @Column(name = "callback_time", nullable = true)
    public Timestamp getCallbackTime() {
        return callbackTime;
    }

    public void setCallbackTime(Timestamp callbackTime) {
        this.callbackTime = callbackTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentInfo that = (PaymentInfo) o;

        if (id != that.id) return false;
        if (orderSn != null ? !orderSn.equals(that.orderSn) : that.orderSn != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (alipayTradeNo != null ? !alipayTradeNo.equals(that.alipayTradeNo) : that.alipayTradeNo != null)
            return false;
        if (totalAmount != null ? !totalAmount.equals(that.totalAmount) : that.totalAmount != null) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;
        if (paymentStatus != null ? !paymentStatus.equals(that.paymentStatus) : that.paymentStatus != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (confirmTime != null ? !confirmTime.equals(that.confirmTime) : that.confirmTime != null) return false;
        if (callbackContent != null ? !callbackContent.equals(that.callbackContent) : that.callbackContent != null)
            return false;
        if (callbackTime != null ? !callbackTime.equals(that.callbackTime) : that.callbackTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (orderSn != null ? orderSn.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (alipayTradeNo != null ? alipayTradeNo.hashCode() : 0);
        result = 31 * result + (totalAmount != null ? totalAmount.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (paymentStatus != null ? paymentStatus.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (confirmTime != null ? confirmTime.hashCode() : 0);
        result = 31 * result + (callbackContent != null ? callbackContent.hashCode() : 0);
        result = 31 * result + (callbackTime != null ? callbackTime.hashCode() : 0);
        return result;
    }
}
