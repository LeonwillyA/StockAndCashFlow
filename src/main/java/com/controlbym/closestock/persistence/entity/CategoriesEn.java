package com.controlbym.closestock.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class CategoriesEn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idCategories;

    private String name;

    public Integer getIdCategories() {
        return idCategories;
    }

    public void setIdCategories(Integer idCategories) {
        this.idCategories = idCategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
