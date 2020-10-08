// Дана строка из нескольких слов, разделённых пробелами. Отсортировать слова в ней по алфавиту,
// т.е. из “bca cba cab acb” получить “acb bca cab cba”. Оценить сложность полученного алгоритма по времени и по памяти.
// пробовал преобразовать массив strings в тип int и сделать quickSort, ранее написанный, но провалился(
// объясню, как работает Arrays.sort(), если понадобится.

// сложность Arrays.sort - nlog(n), for (...) - n, значит сложность в общем - nlog(n).
package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    String str = "abc cba bac cab";
	    String[] strings = str.split(" ");
	    for (int i = 0; i < strings.length; i++) {
	        System.out.println(strings[i]);
        }
        System.out.println(" ");
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
