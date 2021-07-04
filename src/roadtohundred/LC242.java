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
public class LC242 {

    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) {
            return false;
        }
        int[] countalpha = new int[26];
        for (int i = 0; i < s.length(); i++) {
            countalpha[s.charAt(i)-'a']+=1;
            countalpha[t.charAt(i)-'a']-=1;
        }
        for (int i = 0; i < countalpha.length; i++) {
            if (countalpha[i]!=0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
