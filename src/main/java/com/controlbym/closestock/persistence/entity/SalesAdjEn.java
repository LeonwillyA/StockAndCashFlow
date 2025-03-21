package com.controlbym.closestock.persistence.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "sales_adjustments")
public class SalesAdjEn {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idSalesAdj;

    @Column(name = "sale_id")
    private Integer saleId;

    @Column(name = "original_price")
    private BigDecimal originalPrice;

    public Integer getIdSalesAdj() {
        return idSalesAdj;
    }

    public void setIdSalesAdj(Integer idSalesAdj) {
        this.idSalesAdj = idSalesAdj;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }
}
