package com.ccdsa.NumberSystem;

import java.lang.Math;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt(), answer = 0, i = 0;
        while (n!=0) {
            int bit = n & 1;
            answer = (int)(answer + (bit * Math.pow(10,i)));
            n = n >> 1;
            i++;
        }
        System.out.println("The binary is: "+ answer);
    }
}
