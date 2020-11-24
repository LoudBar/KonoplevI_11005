package com.company;

public class Product {

    String title;
    int price;
    String producer;

    public Product(String title, int price, String producer) {
        this.title = title;
        this.price = price;
        this.producer = producer;
    }

    public String getTitle() {
        return title;
    }

    public void display() {
        System.out.println("Product: " + title + " with price: " + price);
    }
}
