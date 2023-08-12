package com.ccdsa.Arrays;

public class MaxSubarraySum_BruteForce {
    public static void maxSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE, currSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum)
                    maxSum = currSum;
            }
        }
        System.out.println("maxSubarraySum is: " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
}
