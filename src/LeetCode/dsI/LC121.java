/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.dsI;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class LC121 {

    /*Brute force
    public int maxProfit(int[] prices) {
        int maxprof = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 1) {
                break;
            }
            for (int j = i + 1; j < prices.length; j++) {
                int temp = prices[j] - prices[i];
                if (maxprof < temp) {
                    maxprof = temp;
                }
            }
            //System.out.println(maxprof);
        }
        return maxprof;
    }*/
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        boolean up = false;
        int profit = 0;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= min) {
                min = prices[i];
                up = false;
            } else {
                up = true;
                profit = prices[i] - min;
            }
            if (profit>maxprofit) {
                maxprofit = profit;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }
}
