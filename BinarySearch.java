package com.company;

import java.util.Scanner;

public class BinarySearch {

    public static void binarySearch(int[] arr, int flag, int low, int high) {
        int index = -1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] < flag) {
                low = mid + 1;
            }
            else if (arr[mid] > flag) {
                high = mid - 1;
            }
            else if (arr[mid] == flag) {
                index = mid;
                break;
            }
        }
        System.out.print(index);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = in.nextInt();
        int[] array = new int[] {-8,1,45,78,235};
        int l = 0;
        int r = array.length - 1;
        binarySearch(array, ans, l, r);
    }
}
