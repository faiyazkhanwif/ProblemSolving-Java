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
public class NumbersWithEvenDigits {

    public int findNumbers(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            String str = Integer.toString(nums[i]);
            int dig = str.length();
            if (dig%2==0) {
                res++;
            }
        }
        return res;
    }
}
