package com.aliens.demoapp.arraysandhash;

/**
 * Given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BuyAndSellStock {


    private static int maxProfit(int[] prices) {
        int profit = 0;
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {

                profit = Math.max(profit, price - minPrice);
            }
        }
        return profit;
    }


    public static void main(String[] args) {
        BuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }
}
