package com.controlbym.closestock.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categories")
public class CategoriesEn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idCategories;

    private String name;

    @OneToMany(mappedBy = "categoriesEn") //Tener en cuenta que categoriesEn es la variable contenida dentro de la clase ProductEn y no es la Clase en si
    private List<ProductEn> productEns;

    public Integer getIdCategories() {
        return idCategories;
    }

    public List<ProductEn> getProductEns() {
        return productEns;
    }

    public void setProductEns(List<ProductEn> productEns) {
        this.productEns = productEns;
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
