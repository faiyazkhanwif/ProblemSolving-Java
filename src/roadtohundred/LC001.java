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
public class LC001 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        //int[] arr = new int[nums.length];
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(target-nums[i], i);
            }else{
                res[0] = hm.get(nums[i]);
                res[1] = i;
            }
            
        }

        return res;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(nums,target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
