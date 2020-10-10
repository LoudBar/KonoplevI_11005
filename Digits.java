//  количество разрядов числа.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        digitsAmount(x);
    }
    public static void digitsAmount(int x) {
        int c = 0;
        while (x > 0) {
            x = x / 10;
            c+=1;
        }
        System.out.println(c);
    }
}

