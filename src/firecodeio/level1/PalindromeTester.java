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
public class PalindromeTester {

    public static boolean isStringPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += String.valueOf(str.charAt(i));
        }
        if (rev.equalsIgnoreCase(str)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isStringPalindrome("madam"));
    }
}
