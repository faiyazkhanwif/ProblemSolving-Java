/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

/**
 *
 * @author faiya
 */
public class LC1512 {

    public int numIdenticalPairs(int[] nums) {
        int i = 0;
        int count = 0;
        while (i != nums.length - 1) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            i++;
        }
        return count;
    }
}
