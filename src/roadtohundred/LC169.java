/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class LC169 {

    public static int majorityElement(int[] nums) {
        int n = nums.length / 2;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int count = hm.get(nums[i]);
                count = count + 1;
                if (count > n) {
                    return nums[i];
                }
                hm.put(nums[i], count);
            } else {
                hm.put(nums[i], 1);
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }
}
