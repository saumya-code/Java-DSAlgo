package com.ccdsa.TwoDimArrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int[] arr : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

        printSpiral(matrix);
    }

    public static void printSpiral(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        System.out.println("\nPrint Spiral : ");

        while (startRow <= endRow && startCol <= endCol) {
            //top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(matrix[endRow][j] + " ");
            }

            //left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }

            //iteration
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
}
