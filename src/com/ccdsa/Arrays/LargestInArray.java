package com.ccdsa.Arrays;

public class LargestInArray {
    public static void largestInArray(int numbers[], int largest) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
        }

        System.out.println("Largest in Array is: " + largest);
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,8,3,5};
        int largest = Integer.MIN_VALUE;

        largestInArray(numbers, largest);
    }
}