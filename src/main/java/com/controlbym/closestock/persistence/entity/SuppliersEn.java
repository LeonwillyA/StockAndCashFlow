package com.controlbym.closestock.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "suppliers")
public class SuppliersEn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idSuppliers;

    private String name;

    @Column(name = "contact_info")
    private String contactInfo;

    public Integer getIdSuppliers() {
        return idSuppliers;
    }

    public void setIdSuppliers(Integer idSuppliers) {
        this.idSuppliers = idSuppliers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
