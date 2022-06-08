package com.ccdsa;

import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        Integer num = in.nextInt();
        Integer temp = num;
        int r, rev=0;
        while (temp>0) {
            r = temp%10;
            rev = rev*10 + r;
            temp/=10;
        }
        if (rev==num)
            System.out.println(num + " is a Pallindrome Number!");
        else
            System.out.println(num + " is not a Pallindrome Number!");

    }
}
