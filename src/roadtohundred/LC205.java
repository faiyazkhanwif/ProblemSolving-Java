/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class LC205 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> hm = new HashMap<>();
        HashMap<Character, Boolean> hm1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (hm.containsKey(a)) {
                if (!hm.get(a).equals(b)) {
                    return false;
                }
            } else {
                if (hm1.containsKey(b)) {
                    return false;
                } else {
                    hm.put(a, b);
                    hm1.put(b, true);
                }
            }
        }
        return true;
    }
}
