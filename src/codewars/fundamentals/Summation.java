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
public class Summation {

    public static int summation(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res+=i;
        }
        return res;
    }
}
