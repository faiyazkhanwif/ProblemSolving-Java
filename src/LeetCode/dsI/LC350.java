/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.dsI;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class LC350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        if  (nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        ArrayList<Integer> arrl = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        
        for (int i = 0; i<nums1.length; i++){
            if  (hm.get(nums1[i])!=null){
                int count = hm.get(nums1[i]);
                hm.put(nums1[i],count+1);
            }else{
                hm.put(nums1[i],1);
            }
        }
        for (int i = 0; i<nums2.length; i++){
            if  (hm1.get(nums2[i])!=null){
                int count = hm1.get(nums2[i]);
                hm1.put(nums2[i],count+1);
            }else{
                hm1.put(nums2[i],1);
            }
        }
        
        for (int i = 0; i < nums2.length; i++){
            if(hm.get(nums2[i])!=null){
                int n = Math.min(hm.get(nums2[i]),hm1.get(nums2[i]));
                System.out.println(n);
                for (int j = 0; j<n ; j++){
                    arrl.add(nums2[i]);
                    hm.put(nums2[i],null);
                }
            }
        }
        
        int[] arr = new int[arrl.size()];
        
        for (int i = 0; i < arrl.size(); i++){
            arr[i] = arrl.get(i);
        }
        return arr;

    }
}
