/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.algo;

/**
 *
 * @author faiya
 */
public class LC704 {

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + ((end - start)/2);
            if  (nums[mid] == target){
                return mid;
            }else if (nums[mid]>target){
                end = mid - 1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;
        System.out.println(search(arr, target));
    }
}
