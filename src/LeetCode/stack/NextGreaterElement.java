/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.stack;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            hm.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            int temp = nums1[i];
            int index = hm.get(temp);
            //System.out.println(index);
            boolean found = false;
            for (int j = index + 1; j < nums2.length; j++) {
                //System.out.println("comp: "+nums2[j]);
                if (temp < nums2[j]) {
                    res[i] = nums2[j];
                    found = true;
                    break;
                }
            }
            if (found == false) {
                res[i] = -1;
            }
        }
        return res;
    }
}
