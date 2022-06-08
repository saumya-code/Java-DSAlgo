package com.ccdsa.Strings;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromStringWithHashing {
    private static String removeDuplicates(char[] str) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for (int i = 0; i < str.length; i++) {
            lhs.add(str[i]);
        }

        String s = "";
        for (Character x : lhs)
            s += x;
        return (s);
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(removeDuplicates(str.toCharArray()));
    }
}
