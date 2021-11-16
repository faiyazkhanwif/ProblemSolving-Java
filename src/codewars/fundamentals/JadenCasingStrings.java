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
public class JadenCasingStrings {

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        String res = "";
        for (int i = 0; i < phrase.length(); i++) {
            if (i == 0) {
                String temp = String.valueOf(phrase.charAt(i)).toUpperCase();
                res += temp;
            } else {
                if (i != phrase.length()) {
                    if (phrase.charAt(i - 1) == ' ') {
                        String temp = String.valueOf(phrase.charAt(i)).toUpperCase();
                        res += temp;
                    } else {
                        res += String.valueOf(phrase.charAt(i));
                    }
                } else {
                    res += String.valueOf(phrase.charAt(i));
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String res = toJadenCase("How can mirrors be real if our eyes aren't real");
        System.out.println(res);
    }
}
