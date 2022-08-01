package com.ccdsa.Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            for (int j = 1; j <= i; j++)
                System.out.print((char)('A' + i + j - 2) + " ");

            System.out.println();
            i++;
        }
    }
}
