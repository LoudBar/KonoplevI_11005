package com.company;

public class Main {

    public static void reverseString(String str) {
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        String str = "ароза упал ан алапу азор а";
        reverseString(str);
    }
}
