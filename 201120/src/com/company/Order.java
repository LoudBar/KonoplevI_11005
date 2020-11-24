package com.company;

public class Order {

    private Customer customer;
    private Product product;

    public Order(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public void display() {
        System.out.println("Order: " + customer.getName() + " bought " + product.getTitle());
    }
}
