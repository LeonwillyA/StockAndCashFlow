package com.controlbym.closestock.persistence.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "purchase_items")
public class PurchaseItEn {

    @EmbeddedId
    private PurchaseItPKEn id;

    private Integer quantity;

    @Column(name = "cost_per_unit")
    private BigDecimal costPerUnit;

    public PurchaseItPKEn getId() {
        return id;
    }

    public void setId(PurchaseItPKEn id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(BigDecimal costPerUnit) {
        this.costPerUnit = costPerUnit;
    }
}
