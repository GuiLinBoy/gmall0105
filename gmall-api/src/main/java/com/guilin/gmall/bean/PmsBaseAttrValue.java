package com.guilin.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pms_base_attr_value", schema = "gmall_study")
public class PmsBaseAttrValue implements Serializable {
    private long id;
    private String valueName;
    private Long attrId;
    private String isEnabled;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "value_name", nullable = false, length = 100)
    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
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
    @Column(name = "is_enabled", nullable = true, length = 1)
    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsBaseAttrValue that = (PmsBaseAttrValue) o;

        if (id != that.id) return false;
        if (valueName != null ? !valueName.equals(that.valueName) : that.valueName != null) return false;
        if (attrId != null ? !attrId.equals(that.attrId) : that.attrId != null) return false;
        if (isEnabled != null ? !isEnabled.equals(that.isEnabled) : that.isEnabled != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (valueName != null ? valueName.hashCode() : 0);
        result = 31 * result + (attrId != null ? attrId.hashCode() : 0);
        result = 31 * result + (isEnabled != null ? isEnabled.hashCode() : 0);
        return result;
    }
}
