package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Actions {

    private Order currentOrder;
    Scanner in = new Scanner(System.in);
    private Product[] products;
    ArrayList orders = new ArrayList();

    public void displayOrderInfo() {

        System.out.println("Orders information: ");

        for (int i = 0; i < orders.size(); i++) {
            System.out.println((i+1));
            System.out.println(orders.get(i));
        }
    }
}
