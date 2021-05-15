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
public class ProductandSumofDigits {

    public int subtractProductAndSum(int n) {
        String ns = String.valueOf(n);
        int product = 1;
        int sum = 0;
        for (int i = 0; i < ns.length(); i++) {
            product = product * Integer.valueOf(String.valueOf(ns.charAt(i)));
            sum = sum + Integer.valueOf(String.valueOf(ns.charAt(i)));
        }
        return product - sum;
    }
}
