package com.guilin.gmall.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "wms_ware_order_task", schema = "gmall_study", catalog = "")
public class WmsWareOrderTask {
    private long id;
    private Long orderId;
    private String consignee;
    private String consigneeTel;
    private String deliveryAddress;
    private String orderComment;
    private String paymentWay;
    private String taskStatus;
    private String orderBody;
    private String trackingNo;
    private Timestamp createTime;
    private Long wareId;
    private String taskComment;

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
    @Column(name = "consignee", nullable = true, length = 100)
    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    @Basic
    @Column(name = "consignee_tel", nullable = true, length = 20)
    public String getConsigneeTel() {
        return consigneeTel;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel;
    }

    @Basic
    @Column(name = "delivery_address", nullable = true, length = 1000)
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Basic
    @Column(name = "order_comment", nullable = true, length = 200)
    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

    @Basic
    @Column(name = "payment_way", nullable = true, length = 2)
    public String getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    @Basic
    @Column(name = "task_status", nullable = true, length = 20)
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Basic
    @Column(name = "order_body", nullable = true, length = 200)
    public String getOrderBody() {
        return orderBody;
    }

    public void setOrderBody(String orderBody) {
        this.orderBody = orderBody;
    }

    @Basic
    @Column(name = "tracking_no", nullable = true, length = 200)
    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
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
    @Column(name = "ware_id", nullable = true)
    public Long getWareId() {
        return wareId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    @Basic
    @Column(name = "task_comment", nullable = true, length = 500)
    public String getTaskComment() {
        return taskComment;
    }

    public void setTaskComment(String taskComment) {
        this.taskComment = taskComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WmsWareOrderTask that = (WmsWareOrderTask) o;

        if (id != that.id) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (consignee != null ? !consignee.equals(that.consignee) : that.consignee != null) return false;
        if (consigneeTel != null ? !consigneeTel.equals(that.consigneeTel) : that.consigneeTel != null) return false;
        if (deliveryAddress != null ? !deliveryAddress.equals(that.deliveryAddress) : that.deliveryAddress != null)
            return false;
        if (orderComment != null ? !orderComment.equals(that.orderComment) : that.orderComment != null) return false;
        if (paymentWay != null ? !paymentWay.equals(that.paymentWay) : that.paymentWay != null) return false;
        if (taskStatus != null ? !taskStatus.equals(that.taskStatus) : that.taskStatus != null) return false;
        if (orderBody != null ? !orderBody.equals(that.orderBody) : that.orderBody != null) return false;
        if (trackingNo != null ? !trackingNo.equals(that.trackingNo) : that.trackingNo != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (wareId != null ? !wareId.equals(that.wareId) : that.wareId != null) return false;
        if (taskComment != null ? !taskComment.equals(that.taskComment) : that.taskComment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (consignee != null ? consignee.hashCode() : 0);
        result = 31 * result + (consigneeTel != null ? consigneeTel.hashCode() : 0);
        result = 31 * result + (deliveryAddress != null ? deliveryAddress.hashCode() : 0);
        result = 31 * result + (orderComment != null ? orderComment.hashCode() : 0);
        result = 31 * result + (paymentWay != null ? paymentWay.hashCode() : 0);
        result = 31 * result + (taskStatus != null ? taskStatus.hashCode() : 0);
        result = 31 * result + (orderBody != null ? orderBody.hashCode() : 0);
        result = 31 * result + (trackingNo != null ? trackingNo.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (wareId != null ? wareId.hashCode() : 0);
        result = 31 * result + (taskComment != null ? taskComment.hashCode() : 0);
        return result;
    }
}
