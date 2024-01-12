package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idOrder;
    @Column(name = "idProduct",nullable=false)
    private String idProduct;
    @Column(name = "description",nullable=false)
    private String description;

    public Order(){}

    public Order(long idOrder, String idProduct, String description) {
        super();
        this.idOrder = idOrder;
        this.idProduct = idProduct;
        this.description = description;
    }

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
