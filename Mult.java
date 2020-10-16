// Перемножить числа до n
package com.company;

public class Main {

    public static int multRecursive(int n) {
        if (n < 1)
            return 1;
        return n * multRecursive(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print("mult: " + multRecursive(n));
    }
}
