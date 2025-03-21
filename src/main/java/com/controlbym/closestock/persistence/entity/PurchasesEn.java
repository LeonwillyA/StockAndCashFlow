package com.controlbym.closestock.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "purchases")
public class PurchasesEn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idPurchasesEn;

    @Column(name = "purchase_date")
    private LocalDateTime purchaseDate;

    @Column(name =  "supplier_id")
    private Integer supplierId;

    public Integer getIdPurchasesEn() {
        return idPurchasesEn;
    }

    public void setIdPurchasesEn(Integer idPurchasesEn) {
        this.idPurchasesEn = idPurchasesEn;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }
}
