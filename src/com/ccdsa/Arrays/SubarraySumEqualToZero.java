package com.ccdsa.Arrays;

import java.util.HashSet;
import java.util.Set;

public class SubarraySumEqualToZero {
    public static boolean subArrayWithSumZeroExists(int[] a) {
        //below we have brute-force solution - O(n)^2
//        boolean found = false;
//        for (int i = 0; i < a.length; i++) {
//            int sum = 0;
//            for (int j = i; j < a.length; j++) {
//                sum += a[j];
//                if (sum == 0) {
//                    found = true;
//                    break;
//                }
//            }
//            if (found)
//                break;
//        }
//        return found;

        //below we have O(n) solution
        //int k = targetSum;
        boolean found = false;
        Set<Integer> setOfSums = new HashSet<>();
        int sum = 0;
        for (Integer element : a) {
            setOfSums.add(sum);
            sum += element;
            //if (setOfSums.contains(sum-k)) {
            if (setOfSums.contains(sum)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[] a = {3,4,-1,4,3,-6,-7,2};
        System.out.println("found: " + subArrayWithSumZeroExists(a));
    }
}
