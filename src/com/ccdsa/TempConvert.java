package com.ccdsa;

import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter temperature in Celcius...");
        float tempInC = in.nextFloat();
        float tempInF = tempInC * 1.8f + 32;
        System.out.println("Converted temp in deg F : " + tempInF);
    }
}
