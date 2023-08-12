package com.ccdsa.NumberSystem;

import java.util.Scanner;

public class CountingNotesInAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an amount...");
        int amount = sc.nextInt();
        int noteArray[] = new int[]{100,50,20,10};

        for (int i = 0; i < noteArray.length; i++) {
                System.out.println("Number of Rs." + noteArray[i] + " note is " + amount/noteArray[i]);
                amount = amount % noteArray[i];
            }
        }
}
