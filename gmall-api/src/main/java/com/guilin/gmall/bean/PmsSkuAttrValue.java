package com.guilin.gmall.bean;

import javax.persistence.*;

@Entity
@Table(name = "pms_sku_attr_value", schema = "gmall_study", catalog = "")
public class PmsSkuAttrValue {
    private long id;
    private Long attrId;
    private Long valueId;
    private Long skuId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "attr_id", nullable = true)
    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    @Basic
    @Column(name = "value_id", nullable = true)
    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    @Basic
    @Column(name = "sku_id", nullable = true)
    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsSkuAttrValue that = (PmsSkuAttrValue) o;

        if (id != that.id) return false;
        if (attrId != null ? !attrId.equals(that.attrId) : that.attrId != null) return false;
        if (valueId != null ? !valueId.equals(that.valueId) : that.valueId != null) return false;
        if (skuId != null ? !skuId.equals(that.skuId) : that.skuId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (attrId != null ? attrId.hashCode() : 0);
        result = 31 * result + (valueId != null ? valueId.hashCode() : 0);
        result = 31 * result + (skuId != null ? skuId.hashCode() : 0);
        return result;
    }
}
