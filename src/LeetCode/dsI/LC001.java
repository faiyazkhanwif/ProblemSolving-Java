/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.dsI;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class LC001 {

    /* O(n^2)
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp == nums[j]) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
     */
    //O(n)
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i]) && hm.get(nums[i]) != i) {
                res[0] = hm.get(nums[i]);
                res[1] = i;
                break;
            }
            hm.put(target - nums[i], i);
        }
        return res;
    }
}
