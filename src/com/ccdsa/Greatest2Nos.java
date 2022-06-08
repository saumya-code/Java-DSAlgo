package com.ccdsa;

import java.util.Scanner;

public class Greatest2Nos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers...");
        Integer a = in.nextInt();
        Integer b = in.nextInt();
        if(a > b)
            System.out.println(a + " is the greatest");
        else
            System.out.println(b + " is the greatest");
    }
}
