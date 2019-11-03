package com.guilin.gmall.bean;

import javax.persistence.*;

@Entity
@Table(name = "wms_ware_sku", schema = "gmall_study", catalog = "")
public class WmsWareSku {
    private long id;
    private Long skuId;
    private Long warehouseId;
    private Integer stock;
    private String stockName;
    private Integer stockLocked;

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
    @Column(name = "warehouse_id", nullable = true)
    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    @Basic
    @Column(name = "stock", nullable = true)
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Basic
    @Column(name = "stock_name", nullable = true, length = 200)
    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @Basic
    @Column(name = "stock_locked", nullable = true)
    public Integer getStockLocked() {
        return stockLocked;
    }

    public void setStockLocked(Integer stockLocked) {
        this.stockLocked = stockLocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WmsWareSku that = (WmsWareSku) o;

        if (id != that.id) return false;
        if (skuId != null ? !skuId.equals(that.skuId) : that.skuId != null) return false;
        if (warehouseId != null ? !warehouseId.equals(that.warehouseId) : that.warehouseId != null) return false;
        if (stock != null ? !stock.equals(that.stock) : that.stock != null) return false;
        if (stockName != null ? !stockName.equals(that.stockName) : that.stockName != null) return false;
        if (stockLocked != null ? !stockLocked.equals(that.stockLocked) : that.stockLocked != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (skuId != null ? skuId.hashCode() : 0);
        result = 31 * result + (warehouseId != null ? warehouseId.hashCode() : 0);
        result = 31 * result + (stock != null ? stock.hashCode() : 0);
        result = 31 * result + (stockName != null ? stockName.hashCode() : 0);
        result = 31 * result + (stockLocked != null ? stockLocked.hashCode() : 0);
        return result;
    }
}
