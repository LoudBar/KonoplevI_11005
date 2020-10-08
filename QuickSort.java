// Быстрая сортировка
package com.company;

public class QuickSort {

    public static void quickSort(int[] array, int l, int r) {
        int l_index = l;
        int r_index = r;
        int pivot = array[(l_index + r_index)/2];
        while (array[l_index] < pivot) {
            l_index++;
        }
        while (array[r_index] > pivot) {
            r_index--;
        }
        if (l_index <= r_index) {
            if ( l_index < r_index) {
                int temp = array[l_index];
                array[l_index] = array[r_index];
                array[r_index] = temp;
            }
            l_index++;
            r_index--;
        }
        if (l_index < r) {
            quickSort(array, l_index, r);
        }
        if (l < r_index) {
            quickSort(array, l, r_index);
        }

    }
    public static void main(String[] args) {
        int l = 0;
        int[] arr = new int[]{12, 2, 1, 62, 84, 1, -1, -55, 98};
        int r = arr.length-1;
        quickSort(arr, l, r);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


