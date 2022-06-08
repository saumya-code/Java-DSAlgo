package com.ccdsa.Strings;

import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string...");
        String str = in.nextLine();
        String strRev = "";
        for (int i=str.length()-1; i>=0; i--) {
            strRev+=str.charAt(i);
        }
        if (str.equalsIgnoreCase(strRev))
            System.out.println("It's a pallindrome string!");
        else
            System.out.println("It's not a pallindrome string!");
    }
}
