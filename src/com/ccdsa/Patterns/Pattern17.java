package com.ccdsa.Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        int i = 1, space;
        while (i <= n) {
            space = n-i;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }
            for (int j = 1; j <= i; j++)
                System.out.print(j);

            for (int k = i-1; k >= 1; k--)
                System.out.print(k);

            System.out.println();
            i++;
        }
    }
}
