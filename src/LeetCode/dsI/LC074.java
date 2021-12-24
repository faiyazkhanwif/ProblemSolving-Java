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
public class LC074 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int mlen = matrix.length;
        int nlen = matrix[0].length;
        int n;
        int count = 0;
        if (mlen < 2) {
            n = mlen - 1;
        } else {
            n = mlen / 2;
        }
        while (n >= 0 && n <= mlen - 1) {
            if (matrix[n][0] == target || matrix[n][nlen - 1] == target) {
                return true;
            } else if (matrix[n][0] < target && matrix[n][nlen - 1] > target) {
                break;
            } else if (matrix[n][0] > target) {
                n--;
            } else if (matrix[n][nlen - 1] < target) {
                n++;
            }
            count++;
            if (count == mlen) {
                break;
            }
        }
        System.out.println(n);
        if (n > mlen - 1 || n < 0) {
            return false;
        }

        int c = 0;
        if (nlen < 2) {
            c = nlen - 1;
        } else {
            c = nlen / 2;
        }

        int count2 = 0;
        while (c >= 0 && c < nlen) {
            if (matrix[n][c] == target) {
                return true;
            } else if (matrix[n][c] > target) {
                c--;
            } else if (matrix[n][c] < target) {
                c++;
            }
            count2++;
            if (count2 > nlen) {
                break;
            }
        }

        return false;
    }
    
    /*Optimized step search algo
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
    */

}
