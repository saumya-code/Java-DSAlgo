package com.ccdsa.Patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        int i = n;
        while (i >= 1) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
            i--;
        }
    }
}
