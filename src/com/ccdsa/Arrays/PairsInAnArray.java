package com.ccdsa.Arrays;

public class PairsInAnArray {
    public static void printPairs(int numbers[]) {
        int curr, tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            curr = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + tp); //formula is n(n-1)/2
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
}
