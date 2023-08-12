package com.ccdsa.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class TripletSumEqualToZero {
    public static List<List<Integer>> tripletSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<>(new LinkedHashSet<>(result));
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 1, 0, -2, 2, -1};
        System.out.println("Triplets whose sum equals to zero are: " + tripletSum(nums));
    }
}
