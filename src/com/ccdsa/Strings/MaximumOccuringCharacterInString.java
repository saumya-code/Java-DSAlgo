package com.ccdsa.Strings;

public class MaximumOccuringCharacterInString {
    private static Character maxOccrChar(String str) {
        int[] arr = new int[128];
        for (int i = 0; i < str.length(); i++)
            arr[str.charAt(i)]++;

        int max = -1;
        char result = ' ';
        for (int i = 0; i < 128; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char)i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "geekkks";
        System.out.println(maxOccrChar(str));
    }
}
