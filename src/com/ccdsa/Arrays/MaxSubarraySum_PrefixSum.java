package com.ccdsa.Arrays;

public class MaxSubarraySum_PrefixSum {
    public static void maxSubarraySumUsingPrefixSum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE, currSum = Integer.MIN_VALUE;
        int[] prefixArray = new int[numbers.length];
        //calculate prefixArray
        prefixArray[0] = numbers[0];
        for (int k = 1; k < prefixArray.length; k++) {
            prefixArray[k] = prefixArray[k-1] + numbers[k];
        }

        for (int i = 0; i< numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefixArray[end] : prefixArray[end] - prefixArray[start-1];
                if (currSum > maxSum)
                    maxSum = currSum;
            }
        }

        System.out.println("Max subArray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = {1,-2,6,-1,3};
        maxSubarraySumUsingPrefixSum(numbers);
    }
}
