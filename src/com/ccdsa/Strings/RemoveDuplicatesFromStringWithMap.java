package com.ccdsa.Strings;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromStringWithMap {
    private static String removeDuplicates(String str) {
        Map<Character, Integer> charMap = new HashMap<>(str.length());
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if(!charMap.containsKey(str.charAt(i))) {
                charMap.put(str.charAt(i), 1);
                str1 += str.charAt(i);
            }
        }
        return str1;
    }

    public static void main(String[] args) {
        String str = "geeksforgeels";
        System.out.println(removeDuplicates(str));
    }
}
