/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level1;

/**
 *
 * @author faiya
 */
//Interview ques from InfoSys.
public class HorizontalFlip {

    /* Logical solution but not compatible with firecode IDE.
    public static int[][] flipHorizontalAxis(int[][] matrix) {
        int[][] flipmat = new int[matrix.length][];
        int m = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            flipmat[m] = matrix[i]; 
            m++;
        }
        matrix = flipmat;
        return matrix;
    }
     */
    public static int[][] flipHorizontalAxis(int[][] matrix) {
        int m = 0;
        for (int i = matrix.length - 1; i >= matrix.length/2; i--) {
            int[] temp = matrix[i];
            matrix[i] = matrix[m];
            matrix[m] = temp;
            m++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] test = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] res = flipHorizontalAxis(test);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
