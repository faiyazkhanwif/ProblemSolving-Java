/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author faiya
 */
public class SingleNumber {

    //not optimal
    /*
    public int singleNumber(int[] nums) {
        int temp = -1;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            int count = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }else{
                    if (temp == nums[j]) {
                        count++;
                    }
                }
            }
            if (count==1) {
                break;
            }
        }
        return temp;
    }
     */
    //Using XOR Bit manipulation
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }
}
