/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars.fundamentals;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class DuplicateEncoder {

    static String encode(String word) {
        String myword = word.toLowerCase();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < myword.length(); i++) {
            if (hm.containsKey(myword.charAt(i))) {
                int count = hm.get(myword.charAt(i));
                hm.put(myword.charAt(i), count + 1);
            } else {
                hm.put(myword.charAt(i), 1);
            }
        }
        String res = "";
        for (int i = 0; i < myword.length(); i++) {
            if (hm.get(myword.charAt(i)) > 1) {
                res = res += ")";
            } else {
                res = res += "(";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String res = encode("(( @");
        System.out.println(res);
    }
}
