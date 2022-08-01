package com.ccdsa.Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        int i = 0, flag=1;
        while (i < n) {
            for (int j = 0; j < n; j++)
                System.out.print((flag++) + " ");

            System.out.println();
            i++;
        }
    }
}
