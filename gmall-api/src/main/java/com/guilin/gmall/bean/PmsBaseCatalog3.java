package com.guilin.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pms_base_catalog3", schema = "gmall_study")
public class PmsBaseCatalog3 implements Serializable {
    private long id;
    private String name;
    private Long catalog2Id;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "catalog2_id", nullable = true)
    public Long getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(Long catalog2Id) {
        this.catalog2Id = catalog2Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsBaseCatalog3 that = (PmsBaseCatalog3) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (catalog2Id != null ? !catalog2Id.equals(that.catalog2Id) : that.catalog2Id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (catalog2Id != null ? catalog2Id.hashCode() : 0);
        return result;
    }
}
