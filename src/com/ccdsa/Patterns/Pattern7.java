package com.ccdsa.Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            for (int j = i; j >= 1; j--)
                System.out.print((j) + " ");

            System.out.println();
            i++;
        }
    }
}
