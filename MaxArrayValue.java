//  максимальное значение массива.
package com.company;

public class Main {

    public static void mArrValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
	    int[] arr = {-1928,-12,-16,-97,-55};
	    mArrValue(arr);
    }
}
