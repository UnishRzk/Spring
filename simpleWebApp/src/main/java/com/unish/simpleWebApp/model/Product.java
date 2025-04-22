package com.unish.simpleWebApp.model;

import org.springframework.stereotype.Component;

public class Product {

    private Integer prodId;
    private String prodName;
    private Integer price;

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.price = price;
        this.prodName = prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", prodName='" + prodName + '\'' +
                ", prodId=" + prodId +
                '}';
    }
}
