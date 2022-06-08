package com.ccdsa;

import java.util.Scanner;

public class ArithmeticCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        Integer a = in.nextInt();
        Integer b = in.nextInt();
        System.out.println("Enter one operator");
        String op = in.next();
        switch (op) {
            case "+" :
                System.out.println("the sum of two numbers is : " + (a+b));
                break;
            case "-" :
                System.out.println("the difference of two numbers is : " + (a-b));
                break;
            case "*" :
                System.out.println("the product of two numbers is : " + (a*b));
                break;
            case "/" :
                System.out.println("the division of two numbers is : " + (a/b));
        }
    }
}
