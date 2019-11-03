package com.guilin.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pms_base_catalog2", schema = "gmall_study")
public class PmsBaseCatalog2 implements Serializable {
    private int id;
    private String name;
    private Integer catalog1Id;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    @Column(name = "catalog1_id", nullable = true)
    public Integer getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(Integer catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsBaseCatalog2 that = (PmsBaseCatalog2) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (catalog1Id != null ? !catalog1Id.equals(that.catalog1Id) : that.catalog1Id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (catalog1Id != null ? catalog1Id.hashCode() : 0);
        return result;
    }
}
