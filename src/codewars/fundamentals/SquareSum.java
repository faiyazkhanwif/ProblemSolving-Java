/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars.fundamentals;

/**
 *
 * @author faiya
 */
public class SquareSum {

    public static int squareSum(int[] n) {
        int res = 0;
        for (int i = 0; i < n.length; i++) {
            res += (n[i] * n[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(squareSum(arr));
    }
}
