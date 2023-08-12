package com.ccdsa.Arrays;

public class MaxSubarraySum_KadanesAlgo {
    public static void maxSubarraySum(int[] numbers) {
        int maxSum = numbers[0], currSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            //1st step
            currSum += numbers[i];
            //2nd step
            maxSum = Math.max(currSum, maxSum);
            //3rd step
            if (currSum < 0)
                currSum = 0;
        }

        System.out.println("Max Subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = {1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
}
