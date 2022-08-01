package com.ccdsa.Patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            for (int j = 1; j <= n; j++)
                System.out.print((char)('A' + j - 1) + " ");

            System.out.println();
            i++;
        }
    }
}
