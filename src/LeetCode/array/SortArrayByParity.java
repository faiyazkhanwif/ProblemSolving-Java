/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.array;

/**
 *
 * @author faiya
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        int ans[] = new int[A.length];
        int start = 0;
        int end = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                ans[start] = A[i];
                start++;
            } else {
                ans[end] = A[i];
                end--;
            }
        }
        return ans;
    }
}
