/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class MajorityElement {
//Not that fast
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.get(nums[i]) == null) {
                hm.put(nums[i], 1);
            } else {
                int count = hm.get(nums[i]) + 1;
                if (count > nums.length / 2) {
                    return nums[i];
                } else {
                    hm.replace(nums[i], count);
                }
            }
        }
        return nums[0];
    }
// Faster
    /* Boyer-Moore Algo
     public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
    */
}
