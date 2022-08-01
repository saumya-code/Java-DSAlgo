package com.ccdsa.NumberSystem;

import java.util.Scanner;

public class SubtractProductandSumofDigitsofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0, product = 1, r;
        while(n != 0) {
            r = n % 10;
            sum += r;
            product *= r;
            n /= 10;
        }

        System.out.println("Product of digits is: "+product+" \nSum of digits is: "+sum);
        System.out.println("Required output is: "+(product-sum));
    }
}
