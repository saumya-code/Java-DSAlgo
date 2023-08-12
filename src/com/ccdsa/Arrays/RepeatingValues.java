package com.ccdsa.Arrays;

import java.util.HashSet;

public class RepeatingValues {
    public static boolean repeatedValuesCheck_optimal(int[] values) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int value : values) {
            if (hashSet.contains(value))
                return true;
            else
                hashSet.add(value);
        }
        return false;
    }

    public static boolean repeatedValuesCheck_bruteForce(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] == values[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //int[] values = {1,2,3,1};
        //int[] values = {1,2,3,4};
        int[] values = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        //System.out.println("is any value repeated? : " + repeatedValuesCheck_bruteForce(values));
        System.out.println("is any value repeated? : " + repeatedValuesCheck_optimal(values));
    }
}
