/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class ValidAnagrams {

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> calc = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (calc.get(s.charAt(i)) == null) {
                calc.put(s.charAt(i), 1);
            } else {
                int count = calc.get(s.charAt(i));
                count++;
                calc.put(s.charAt(i), count);
            }
        }
        HashMap<Character, Integer> calc2 = new HashMap();
        for (int i = 0; i < t.length(); i++) {
            if (calc2.get(t.charAt(i)) == null) {
                calc2.put(t.charAt(i), 1);
            } else {
                int count = calc2.get(t.charAt(i));
                count++;
                calc2.put(t.charAt(i), count);
            }
        }
        if (calc.size() != calc2.size()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            int temp1 = calc.get(s.charAt(i));
            if (calc2.get(s.charAt(i))==null) {
                return false;
            }
            int temp2 = calc2.get(s.charAt(i));
            if (temp1 == temp2) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }
}
