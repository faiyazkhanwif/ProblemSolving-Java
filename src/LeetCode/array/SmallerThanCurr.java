/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class SmallerThanCurr {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] temp = nums.clone();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            hm.putIfAbsent(nums[i], i);
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            //System.out.println(temp[i]);
            int ind = hm.get(temp[i]);
            res[i] = ind;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] p = {8, 1, 2, 2, 3};
        int[] arr = smallerNumbersThanCurrent(p);
        System.out.println("Ans----------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
