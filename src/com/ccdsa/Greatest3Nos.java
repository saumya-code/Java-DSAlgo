package com.ccdsa;

import java.util.Scanner;

public class Greatest3Nos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers...");
        Integer a = in.nextInt();
        Integer b = in.nextInt();
        Integer c = in.nextInt();
        if (a>b) {
            if (a>c)
                System.out.println(a + " is the largest number");
            else
                System.out.println(c + " is the largest number");
        } else if (b>c)
            System.out.println(b + " is the largest number");
        else
            System.out.println(c + " is the largest number");
    }
}
