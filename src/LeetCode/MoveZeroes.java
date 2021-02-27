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
public class MoveZeroes {

    static void moveZeroes(int[] nums) {
        int ind = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) {
                nums[ind] = nums[i];
                ind++;
            }
        }
        for (int i = ind ; i < nums.length; i++) {
            nums[i] = 0;
        }
        //for (int i = 0; i < nums.length; i++) {
        //    System.out.print(nums[i]+" "); 
        //}
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1};
        moveZeroes(nums);
    }
}
