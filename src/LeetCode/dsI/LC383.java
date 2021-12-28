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
public class LC383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            if (!hm2.containsKey(magazine.charAt(i))) {
                hm2.put(magazine.charAt(i), 1);
            } else {
                hm2.put(magazine.charAt(i), hm2.get(magazine.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (!hm2.containsKey(ransomNote.charAt(i)) || (hm2.get(ransomNote.charAt(i)) <= 0)) {
                return false;
            } else {
                hm2.put(ransomNote.charAt(i), hm2.get(ransomNote.charAt(i)) - 1);
            }
        }
        return true;
    }

}
