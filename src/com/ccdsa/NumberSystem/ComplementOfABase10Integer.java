package com.ccdsa.NumberSystem;

import java.util.Scanner;

public class ComplementOfABase10Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt(), answer = 0, mask = 0, m = n;
        //edge case
        if (n == 0) {
            System.out.println("Output is: "+1);
            return;
        }

        //making a mask
        while (m!=0) {
            mask = (mask << 1) | 1;
            m = m >> 1;
        }

        answer = (~n) & mask;
        System.out.println("Output is: "+answer);
    }
}
