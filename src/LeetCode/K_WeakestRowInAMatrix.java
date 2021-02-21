/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class K_WeakestRowInAMatrix {

    static int[] kWeakestRows(int[][] mat, int k) {
        int[] countarr = new int[mat.length];
        int[][] arr = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int j = 0;
            int count = 0;
            while (j != mat[i].length && mat[i][j] != 0) {
                count++;
                j++;
            }
            countarr[i] = count;
            arr[i][0] = i;
            arr[i][1] = count;
        }

        Arrays.sort(countarr);
        int h = countarr[countarr.length - 1];

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (countarr[i] == arr[j][1]) {
                    //System.out.println("arr- "+arr[j]);
                    //System.out.println(Integer.parseInt(String.valueOf(arr[j].charAt(2))));
                    ans[i] = j;
                    //System.out.println("Ki dhuktese "+ans[i]);
                    arr[j][0] = -1;
                    arr[j][1] = -1;
                    break;
                }
            }
        }

        //System.out.println("");
        return ans;

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 0}, {1, 0}, {1, 0}, {1, 1}};
        int k = 4;
        int[] ans = kWeakestRows(arr, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
