package com.ccdsa.NumberSystem;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt(), answer = 1;
        for (int i = 1; i <= 31; i++) {
            if (n == answer) {
                System.out.println("Number is 2 to the power "+(i-1));
                return;
            }
            if (answer < Integer.MAX_VALUE/2)
                answer = answer * 2;
        }
        System.out.println("False");
    }
}
