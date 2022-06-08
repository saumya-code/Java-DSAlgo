package com.ccdsa.Strings;

import java.util.Arrays;

public class RemoveDuplicatesFromString {
    private static String removeDuplicates(char[] str) {
        int n = str.length, index = 0;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str[j] == str[i])
                    break;
            }

            if (j == i)
                str[index++] = str[i];
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(removeDuplicates(str.toCharArray()));
    }
}
