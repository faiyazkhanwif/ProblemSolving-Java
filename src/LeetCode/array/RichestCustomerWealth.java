/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.array;

/**
 *
 * @author faiya
 */
public class RichestCustomerWealth {
    
    public int maximumWealth(int[][] accounts) {
        int maxrich = -1;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            if (sum>maxrich) {
                maxrich = sum;
            }
        }
        return maxrich;
    }
}

