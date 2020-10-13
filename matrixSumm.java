// Написать метод, который принимает на вход две матрицы и возвращает их сумму.
package com.company;

import java.util.Scanner;

public class Main {

    public static void matrixSumm(int[][] matrix, int[][] matrix2, int a, int b) {
        int i = 0;
        int j = 0;
        int[][] matrix3 = new int[a][b];
        for (i = 0; i < matrix3.length; i++) {
            for (j = 0; j < matrix3[i].length; j++) {
                matrix3[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }
        for (i = 0; i < matrix3.length; i++) {
            System.out.println();
            for (j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("Type in amount of matrix lines: ");
        a = in.nextInt();

        System.out.print("Type in amount of matrix columns': ");
        b = in.nextInt();
        int[][] matrix = new int [a][b];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Type in an element[" + i + "][" + j + "] of the first matrix: ");
                matrix[i][j] = in.nextInt();
            }
        }
        int[][] matrix2 = new int [a][b];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print("Type in an element[" + i + "][" + j + "] of the second matrix: ");
                matrix2[i][j] = in.nextInt();
            }
        }
        matrixSumm(matrix, matrix2, a, b);
    }
}
