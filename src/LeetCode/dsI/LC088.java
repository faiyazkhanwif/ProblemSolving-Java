/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.dsI;

import java.util.Arrays;

/**
 *
 * @author faiya
 */
public class LC088 {
    //O(m+n)
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (p1 < 0) {
                nums1[i] = nums2[p2];
                p2--;
            } else if (p2 < 0) {
                nums1[i] = nums1[p1];
                p1--;
            } else {
                if (nums2[p2] >= nums1[p1]) {
                    nums1[i] = nums2[p2];
                    p2--;
                } else {
                    nums1[i] = nums1[p1];
                    p1--;
                }
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {};
        int m = 1;
        int n = 0;
        int[] arr = merge(nums1, m, nums2, n);

        System.out.println("res--------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }
}
