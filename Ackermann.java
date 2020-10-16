// Функция Аккермана
package com.company;

public class Ackermann {

    public static int ackermann(int m, int n) {
        if (m == 0)
            return n + 1;
        if (n == 0)
            return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 5;
        System.out.println(ackermann(m, n));
    }
}
