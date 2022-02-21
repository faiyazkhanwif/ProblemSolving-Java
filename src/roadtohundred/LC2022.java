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
public class LC2022 {

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != (m * n)) {
            return new int[0][0];
        }
        int[][] arr = new int[m][n];
        int elm_ind = 0;
        int end_ind = n - 1;
        int ind1D = 0;

        for (int i = 0; i < m; i++) { //rows building loop
            System.out.println("");
            System.out.println("Row:" + i);

            for (elm_ind = 0; elm_ind <= end_ind; elm_ind++) {
                System.out.println("Last elm: "+ (end_ind));
                System.out.println("Row: " + i + " Col: " + elm_ind + " Number: " + original[ind1D]);
                arr[i][elm_ind] = original[ind1D];
                ind1D++;
            }
            int temp = (i + 1) * end_ind;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 5, 2};
        int[][] res = construct2DArray(arr, 3, 2);

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
