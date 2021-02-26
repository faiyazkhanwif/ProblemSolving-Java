/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author faiya
 */
public class PermutationsTwo {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        boolean[] chckr = new boolean[nums.length];
        List<Integer> perms = new ArrayList<>();
        Arrays.sort(nums);
        work(nums, perms, chckr, res);
        return res;
    }

    public void work(int[] nums, List<Integer> perms, boolean[] chckr, List<List<Integer>> res) {
        if (nums.length == perms.size()) {
            res.add(new ArrayList<>(perms));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (chckr[i] == true) {
                continue;
            }
            chckr[i] = true;
            perms.add(nums[i]);
            work(nums, perms, chckr, res);
            perms.remove(perms.size() - 1);
            /*
            To generate all possible permutations, we need to remove the least recently 
            added element while we are going up the recursive call stack.
            In the first iteration of the for loop we add all permutations, that start
            with nums[0]. Then, before we can begin building all permutations starting 
            with nums[1], we need to clear the perms (which currently contains 
            permutations from the first iteration of the for loop) - that's exactly what 
            perms.remove(perms.size() - 1) line does.
            */
            chckr[i] = false;
            while(i+1<nums.length && nums[i]==nums[i+1]){
                i++;
            }
        }
    }
}
