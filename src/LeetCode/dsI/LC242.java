/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.dsI;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class LC242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (!hm.containsKey(t.charAt(i))) {
                hm.put(t.charAt(i), 1);
            } else {
                hm.put(t.charAt(i), hm.get(t.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!hm.containsKey(s.charAt(i)) || (hm.get(s.charAt(i))) <= 0) {
                //System.out.println(s.charAt(i));
                return false;
            } else {
                //System.out.println(s.charAt(i));
                hm.put(s.charAt(i), hm.get(s.charAt(i)) - 1);
            }
        }
        return true;
    }
}
