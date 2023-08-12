package com.ccdsa.Arrays;

public class BuyAndSellStock {
    public static int buyAndSellStock(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int todaysProfit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, todaysProfit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4,7};
        System.out.println(buyAndSellStock(prices));
    }
}
