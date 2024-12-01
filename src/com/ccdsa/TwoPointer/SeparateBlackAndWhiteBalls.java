package com.ccdsa;

public class SeparateBlackAndWhiteBalls {
    public long minimumSteps(String s) {
        // 1010101101
        long totalSwaps = 0;
        int wp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                totalSwaps += i - wp;
                wp++;
            }
        }
        return totalSwaps;
    }
}
