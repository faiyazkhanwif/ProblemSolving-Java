/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;


import java.util.HashSet;
import java.util.Set;



/**
 *
 * @author faiya
 */
public class ContainsDuplicates {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        
        if (hs.size()!=nums.length) {
            return false;
        }
        return true;
    }
    
    
}
