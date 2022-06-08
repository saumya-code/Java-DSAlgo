package com.ccdsa.Strings;

import java.util.Arrays;

public class RemoveDuplicatesFromStringWithSorting {
    static String removeDuplicates(char[] str) {
        int ip_ind = 1, res_ind = 1;
        while (ip_ind != str.length) {
            if (str[ip_ind] != str[ip_ind - 1])
                str[res_ind++] = str[ip_ind];
            ip_ind++;
        }
        return new String(str).substring(0, res_ind);
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        System.out.println(removeDuplicates(temp));
    }
}
