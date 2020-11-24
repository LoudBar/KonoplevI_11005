package com.company;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	private static Shop shop;

	public static void addOrder() {
		shop.printCustomers();
		shop.printProducts();

		System.out.println("Enter customer name and product title");

		String customerName = in.nextLine();
		String productTitle = in.nextLine();

		shop.addOrder(customerName, productTitle);
	}
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Customer[] customers = new Customer[2];
		customers[0] = new Customer("Alex", 22, "male");
		customers[1] = new Customer("Bob", 20, "male");

	    Product[] products = new Product[3];
		products[0] = new Product("Snickers", 20, "Mars Inc.");
		products[1] = new Product("Lay's", 25, "PepsiCo Inc.");
		products[2] = new Product("Coca Cola", 20, "Coca Cola Inc.");

		shop = new Shop(customers, products);


		while (true) {
			System.out.println("Choose option: ");
			System.out.println("1. View orders information");
			System.out.println("2. Add an order");
			System.out.println("3. Exit");

			int option = in.nextInt();
			if (option == 1)
				shop.printOrders();

			if (option == 2)
				addOrder();

			if (option == 3)
				break;
		}
    }
}
