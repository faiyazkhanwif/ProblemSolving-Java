/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author faiya
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        boolean[] chckr = new boolean[nums.length];
        List<Integer> perms = new ArrayList<>();
        work(nums, perms, chckr, res);
        return res;
    }

    public void work(int[] nums, List<Integer> perms, boolean[] chckr, List<List<Integer>> res) {
        if (nums.length == perms.size()) {
            res.add(perms = new ArrayList<>());
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
            chckr[i] = false;
        }
    }
}
