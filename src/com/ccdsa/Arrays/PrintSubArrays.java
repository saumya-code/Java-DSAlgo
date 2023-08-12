package com.ccdsa.Arrays;

public class PrintSubArrays {
    public static void printSubarrays(int numbers[]) {
        int tsub = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                tsub++;
            }
            System.out.println();
        }
        System.out.println("Total SubArrays: " + tsub); //formula is n(n+1)/2
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
    }
}
