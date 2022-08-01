package com.ccdsa.Patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        int i = 1, space;
        while (i <= n) {
            space = i-1;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }
            for (int j = i; j <= n; j++)
                System.out.print("*");

            System.out.println();
            i++;
        }
    }
}
