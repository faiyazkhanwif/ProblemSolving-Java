/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class TwoDArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        int maxValue = Integer.MIN_VALUE;
        int width = arr[0].length - 2;

        for (int row = 0; row < arr.length - 2; row++) {
            for (int col = 0; col < width; col++) {

                maxValue = Math.max(maxValue,
                        arr[row][col] + arr[row][col + 1] + arr[row][col + 2]
                        + arr[row + 1][col + 1]
                        + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2]);
            }
        }
        System.out.println(maxValue);
    }
}
