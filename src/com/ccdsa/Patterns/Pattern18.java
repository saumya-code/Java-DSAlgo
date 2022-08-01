package com.ccdsa.Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        int i = n, star;
        while (i >= 1) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);

            star = (n-i)*2;
            while (star > 0) {
                System.out.print("*");
                star--;
            }

            for (int k = i; k >= 1; k--)
                System.out.print(k);

            System.out.println();
            i--;
        }
    }
}
