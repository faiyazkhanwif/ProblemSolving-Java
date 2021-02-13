/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level2;

/**
 *
 * @author faiya
 */
public class IfIntegerPalindrome {

    public static Boolean isIntPalindrome(int x) {
        if (x<0) {
            return false; 
        }
        int orival = x;
        int val = 0;
        while (x != 0) {
            int tobeused = x % 10;
            x = x / 10;
            val = val * 10 + tobeused;
            System.out.println(val);
        }
        if (orival == val) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isIntPalindrome(-1));
    }
}
