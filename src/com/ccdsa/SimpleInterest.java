package com.ccdsa;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter P, T, R for calculating SI");
        Integer p = in.nextInt();
        Integer t = in.nextInt();
        Float r = in.nextFloat();
        System.out.println("Simple Interest is : " + (p * t * r) / 100);
    }
}
