package com.controlbym.closestock.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "inventory_movements")
public class InventoryMoveEn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idInvenMove;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "movement_type")
    private String movementType;

    private Integer quantity;

    @Column(name = "movement_date")
    private LocalDateTime movementDate;

    private String notes;

    public Integer getIdInvenMove() {
        return idInvenMove;
    }

    public void setIdInvenMove(Integer idInvenMove) {
        this.idInvenMove = idInvenMove;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getMovementDate() {
        return movementDate;
    }

    public void setMovementDate(LocalDateTime movementDate) {
        this.movementDate = movementDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
