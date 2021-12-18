/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.dsI;

/**
 *
 * @author faiya
 */
public class LC053 {
/* O(n^3)
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int res = 0;
                for (int k = i; k <= j; k++) {
                    res+=nums[k];
                }
                if (max<res) {
                    max = res;
                }
            }
        }
        return max;
    }
    */
    /* O(n^2)
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum+=nums[j];
                if (max<sum) {
                    max = sum;
                }
            }
        }
        return max;
    }
    */
    // O(n)
    public int maxSubArray(int[] nums){
        if (nums.length == 1){
            return nums[0];
        }else if (nums.length<1){
            return 0;
        }
        int max = nums[0];
        int temp = nums[0];
        for (int i=1; i < nums.length; i++){
            temp = Math.max(temp+nums[i],nums[i]);
            if (temp>max){
                max = temp;
            }
        }
        return max;
    }
    
}
