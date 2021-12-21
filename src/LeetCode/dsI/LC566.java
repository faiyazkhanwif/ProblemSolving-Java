/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.dsI;

/**
 *
 * @author faiya
 */
public class LC566 {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int len = (mat.length) * (mat[0].length);
        int [] arr = new int [len];
        int count = 0;
        int elcount = r * c;
        int [][] res = new int [r][c];
        int rescount = 0;
        if (len != elcount) {
            return mat;
        } else {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    arr[count] = mat[i][j];
                    count++;
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    res[i][j] = arr[rescount];
                    rescount++;
                }
            }
        }
        return res;
    }
}
