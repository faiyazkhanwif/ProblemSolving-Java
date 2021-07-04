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
public class LC88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int mp = m + n - 1;
        while (mp >= 0) {
            if (p1 < 0) {
                nums1[mp] = nums2[p2];
                p2--;
            } else if (p2 < 0) {
                nums1[mp] = nums1[p1];
                p1--;
            } else {
                if (nums1[p1] >= nums2[p2]) {
                    nums1[mp] = nums1[p1];
                    p1--;
                } else if (nums1[p1] < nums2[p2]) {
                    nums1[mp] = nums2[p2];
                    p2--;
                }
            }
            mp--;
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        merge(nums1, m, nums2, n);
    }
}
