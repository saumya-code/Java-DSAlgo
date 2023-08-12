package com.ccdsa.TwoDimArrays;

import java.util.*;

public class BasicMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //storing data in matrix
        int[][] matrix = new int[3][3];
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //print matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        searchKey(matrix, 5, rows, cols);
    }

    public static boolean searchKey(int[][] matrix, int key, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found " + key + " at (" + i + "," + j + ")" );
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
}