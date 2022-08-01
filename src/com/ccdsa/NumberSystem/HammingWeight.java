package com.ccdsa.NumberSystem;

import java.util.Scanner;

public class HammingWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int counter = 0;
        while(n!=0) {
            byte bit = (byte) (n&1);
            if(bit == 1)
                counter++;
            n = n>>1;
        }
        System.out.println("the count of 1 bits is: "+counter);
    }
}
