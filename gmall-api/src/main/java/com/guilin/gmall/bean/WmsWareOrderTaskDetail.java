package com.guilin.gmall.bean;

import javax.persistence.*;

@Entity
@Table(name = "wms_ware_order_task_detail", schema = "gmall_study", catalog = "")
public class WmsWareOrderTaskDetail {
    private long id;
    private Long skuId;
    private String skuName;
    private Integer skuNums;
    private Long taskId;
    private Integer skuNum;

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
    @Column(name = "sku_name", nullable = true, length = 200)
    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    @Basic
    @Column(name = "sku_nums", nullable = true)
    public Integer getSkuNums() {
        return skuNums;
    }

    public void setSkuNums(Integer skuNums) {
        this.skuNums = skuNums;
    }

    @Basic
    @Column(name = "task_id", nullable = true)
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "sku_num", nullable = true)
    public Integer getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WmsWareOrderTaskDetail that = (WmsWareOrderTaskDetail) o;

        if (id != that.id) return false;
        if (skuId != null ? !skuId.equals(that.skuId) : that.skuId != null) return false;
        if (skuName != null ? !skuName.equals(that.skuName) : that.skuName != null) return false;
        if (skuNums != null ? !skuNums.equals(that.skuNums) : that.skuNums != null) return false;
        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        if (skuNum != null ? !skuNum.equals(that.skuNum) : that.skuNum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (skuId != null ? skuId.hashCode() : 0);
        result = 31 * result + (skuName != null ? skuName.hashCode() : 0);
        result = 31 * result + (skuNums != null ? skuNums.hashCode() : 0);
        result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
        result = 31 * result + (skuNum != null ? skuNum.hashCode() : 0);
        return result;
    }
}
