package com.guilin.gmall.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "pms_base_attr_info", schema = "gmall_study")
public class PmsBaseAttrInfo implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private long id;
    private String attrName;
    private Long catalog3Id;
    private String isEnabled;
    @Transient //这个不会被数据库识别
    @TableField(exist = false)//这样就不会被mybatisplus判断这个字段是否在数据库中
    private List<PmsBaseAttrValue> attrValueList;

    public List<PmsBaseAttrValue> getAttrValueList() {
        return attrValueList;
    }

    public void setAttrValueList(List<PmsBaseAttrValue> attrValueList) {
        this.attrValueList = attrValueList;
    }

    @Id

    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "attr_name", nullable = false, length = 100)
    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Basic
    @Column(name = "catalog3_id", nullable = true)
    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
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

        PmsBaseAttrInfo that = (PmsBaseAttrInfo) o;

        if (id != that.id) return false;
        if (attrName != null ? !attrName.equals(that.attrName) : that.attrName != null) return false;
        if (catalog3Id != null ? !catalog3Id.equals(that.catalog3Id) : that.catalog3Id != null) return false;
        if (isEnabled != null ? !isEnabled.equals(that.isEnabled) : that.isEnabled != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (attrName != null ? attrName.hashCode() : 0);
        result = 31 * result + (catalog3Id != null ? catalog3Id.hashCode() : 0);
        result = 31 * result + (isEnabled != null ? isEnabled.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
