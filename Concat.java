// Написать метод, который принимает два массива и “склеивает” их
// (для массивов {1,3,5} и {2,4,6} будет результат {1,3,5,2,4,6}).
package com.company;

import java.util.Arrays;

public class Main {

    public static void concat(int[] array1, int[] array2) {
        String a = Arrays.toString(array1).replaceAll("\\[|\\]|,|\\s", "");
        String b = Arrays.toString(array2).replaceAll("\\[|\\]|,|\\s", "");
        String ans = a.concat(b);
        System.out.println(ans);
    }

    public static void main(String[] args) {
	int[] arr1 = new int[]{1,3,5};
    int[] arr2 = new int[]{2,4,6};
    concat(arr1, arr2);
    }

}
