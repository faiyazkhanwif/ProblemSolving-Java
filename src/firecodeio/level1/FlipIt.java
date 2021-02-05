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
//Interview Question From InfoSys
public class FlipIt {

    public static void flipItVerticalAxis(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int[] temp = new int[matrix[i].length];
            int index = 0;
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                temp[index] = matrix[i][j];
                index++;
            }
            matrix[i] = temp;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] test = {{1, 0}, {1, 0}};
        flipItVerticalAxis(test);
    }
}
