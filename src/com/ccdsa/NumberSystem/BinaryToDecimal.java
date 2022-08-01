package com.ccdsa.NumberSystem;

import java.lang.Math;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt(), answer = 0, i = 0;
        while (n!=0) {
            int digit = n % 10;
            if (digit == 1)
                answer = (int)(answer + Math.pow(2,i));
            n = n / 10;
            i++;
        }
        System.out.println("The decimal is: "+ answer);
    }
}
