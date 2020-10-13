// Написать метод, который принимает два массива и “склеивает” их
// (для массивов {1,3,5} и {2,4,6} будет результат {1,3,5,2,4,6}).
package com.company;

public class Main {

    public static void concat(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length; i < array3.length; i ++) {
            array3[i] = array2[i- array1.length];
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }

    public static void main(String[] args) {
	int[] arr1 = new int[]{1,3,5};
    int[] arr2 = new int[]{2,4,6};
    concat(arr1, arr2);
    }

}
