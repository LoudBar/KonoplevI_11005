// Дана строка из нескольких слов, разделённых пробелами. Отсортировать слова в ней по алфавиту,
// т.е. из “bca cba cab acb” получить “acb bca cab cba”. Оценить сложность полученного алгоритма по времени и по памяти.

// сложность O(nlogn).
package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "abc cba bac cab";
        String[] strings = str.split(" ");
        int l = 0;
        int r = strings.length - 1;
        strings = quickSort(strings, l, r);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public static String[] quickSort(String[] array, int l, int r) {
        int l_index = l;
        int r_index = r;
        String pivot = array[(l_index + r_index) / 2];
        while (array[l_index].compareTo(pivot) < 0) {
            l_index++;
        }
        while (array[r_index].compareTo(pivot) > 0) {
            r_index--;
        }
        if (l_index <= r_index) {
            if (l_index < r_index) {
                String temp = array[l_index];
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
        return (array);
    }
}

