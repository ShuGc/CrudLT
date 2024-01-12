package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long code;
    @Column(name = "productName",nullable=false)
    private String productName;
    @Column(name = "feature",nullable=false)
    private String feature;
    @Column(name = "price",nullable=false)
    private long price;
    @Column(name = "idCategory",nullable=false)
    private long idCategory;

    public Product(){}

    public Product(long code, String productName, String feature, long price, int idCategory) {
        super();
        this.code = code;
        this.productName = productName;
        this.feature = feature;
        this.price = price;
        this.idCategory = idCategory;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(long idCategory) {
        this.idCategory = idCategory;
    }
}
