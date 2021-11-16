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
public class MiddleCharacter {

    public static String getMiddle(String word) {
        String res = "";
        int ln = word.length();
        if (ln % 2 != 0) {
            res = String.valueOf(word.charAt(ln / 2));
        } else {
            res += String.valueOf(word.charAt((ln / 2) - 1));
            res += String.valueOf(word.charAt(ln / 2));
        }
        return res;
    }
}
