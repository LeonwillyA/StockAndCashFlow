package com.controlbym.closestock.persistence.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "sales_data")
public class SalesDataEn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idSalesData;

    @Column(name = "sale_date")
    private LocalDateTime saleDate;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "category")
    private String category;

    @Column(name = "price_with_tax")
    private BigDecimal priceWithTax;

    @Column(name = "price_without_tax")
    private  BigDecimal priceWithoutTax;

    @Column(name = "total_sale_amount")
    private BigDecimal totalSaleAmount;

    public Integer getIdSalesData() {
        return idSalesData;
    }

    public void setIdSalesData(Integer idSalesData) {
        this.idSalesData = idSalesData;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPriceWithTax() {
        return priceWithTax;
    }

    public void setPriceWithTax(BigDecimal priceWithTax) {
        this.priceWithTax = priceWithTax;
    }

    public BigDecimal getPriceWithoutTax() {
        return priceWithoutTax;
    }

    public void setPriceWithoutTax(BigDecimal priceWithoutTax) {
        this.priceWithoutTax = priceWithoutTax;
    }

    public BigDecimal getTotalSaleAmount() {
        return totalSaleAmount;
    }

    public void setTotalSaleAmount(BigDecimal totalSaleAmount) {
        this.totalSaleAmount = totalSaleAmount;
    }
}
