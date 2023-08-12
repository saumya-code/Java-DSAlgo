package com.ccdsa.NumberSystem;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt(), digit, answer = 0;
        while(n!=0) {
            digit = n % 10;
            if ((answer < Integer.MIN_VALUE/10) || (answer > Integer.MAX_VALUE/10)) {
                System.out.println("Sorry, out of range!!");
                return;
            }
            answer = answer*10 + digit;
            n = n/10;
        }
        System.out.println("Output is: "+answer);
    }
}
