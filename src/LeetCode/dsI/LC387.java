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
public class LC387 {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), 1);
            } else {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
