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


    @Column(name = "movement_type")
    private String moveType;


    private Integer quantity;

    @Column(name = "movement_date")
    private LocalDateTime moveDate;

    private String notes;

    @Column(name = "purchase_item_id")
    private Integer purchaseItemId;

    @Column(name = "salei_tem_id")
    private Integer saleItemId;

    /* Las lineas de Source son para poder identificar las devoluciones, dentro de
    * una compra las devoluciones pueden ser de toda la compra o de un articulo en especial
    * Un ajuste puede originarse de un conteo de inventario (stock_opname), pero
    * también de una devolución de cliente. Ambos serían "ajustes", pero diferentes source_type.
    * En movement_type = 'compra', puedes tener varios ítems en la compra (ej. purchase_items).
    * El campo purchase_id puede ser ambiguo si tienes un solo producto afectado, mientras
    * que source_item_id apuntaría directamente al ítem exacto.*/


    @Column(name = "source_type")
    private String sourceType;

    @Column(name = "source_item_id")
    private Integer sourceItemId;
}
