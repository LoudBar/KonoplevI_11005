package com.company;

import java.util.ArrayList;

public class Shop {
    private Product[] products;
    private Customer[] customers;
    private Order[] orders;

    private int ordersCount;

    public Shop(Customer[] customers, Product[] products) {
        this.products = products;
        this.customers = customers;
        this.orders = new Order[10];
    }

    public void addOrder(String customerName, String productTitle) {
        if (ordersCount >= orders.length)
            return;

        Customer customer = findCustomer(customerName);
        if (customer == null){
            System.out.println("There's no customers with that name");
            return;
        }

        Product product = findProduct(productTitle);
        if (product == null) {
            System.out.println("There's no products with than name");
            return;
        }

        orders[ordersCount] = new Order(customer, product);
        ordersCount++;
    }

    public void printOrders() {
        if (ordersCount == 0) {
            System.out.println("There's no orders");
        }

        for (int i = 0; i < ordersCount; i++) {
            orders[i].display();
        }
    }

    public void printCustomers() {
        for (int i = 0; i < customers.length; i++){
            System.out.println("Customer: " + customers[i].getName());
        }
    }

    public void printProducts() {
        for (int i = 0; i < products.length; i++){
            products[i].display();
        }
    }


    private Customer findCustomer(String name){
        for (int i = 0; i < customers.length; i++){
            if (customers[i].getName().equals(name))
                return customers[i];
        }

        return null;
    }

    private Product findProduct(String title){
        for (int i = 0; i < products.length; i++){
            if (products[i].getTitle().equals(title))
                return products[i];
        }

        return null;
    }
}