package com.ccdsa.Strings;

public class RemoveDuplicatesFromStringWithArraySimple {
    public static void main(String[] args) {
        String str = "geeksforgeezs";
        int[] arr = new int[256];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }

        String str1 = "";
        for (int i = 0; i < 256; i++) {
            if (arr[i] >= 1)
                str1 += (char)i;
        }

        System.out.println(str1);
    }
}
