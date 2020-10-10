// Написать метод, который принимает на вход матрицу и транспонирует её.
package com.company;

import java.util.Scanner;

public class Main {

    public static void matrixT(int[][] matrix, int a, int b) {
        int i = 0;
        int j = 0;
        int[][] matrixNew = new int[b][a];
        for (i = 0; i < matrixNew.length; i++) {
            for (j = 0; j < matrixNew[i].length; j++)
                matrixNew[i][j] = matrix[j][i];
        }
        for (i = 0; i < matrixNew.length; i++) {
            System.out.println("");
            for (j = 0; j < matrixNew[i].length; j++) {
                System.out.format(" %d", matrixNew[i][j]);
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
                System.out.print("Type in an element[" + i + "][" + j + "] of the matrix: ");
                matrix[i][j] = in.nextInt();
            }
        }
        matrixT(matrix, a, b);
    }
}
