/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

/**
 *
 * @author faiya
 */
public class Palindrome {

    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String temp = "";
        for (int i = str.length()-1; i >= 0; i--) {
            temp += String.valueOf(str.charAt(i));
        }
        return str.equals(temp);
    }
}
