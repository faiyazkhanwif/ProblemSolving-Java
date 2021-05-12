/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author faiya
 */
public class FirstUniqueChar {

    //Not optimized
    public static int firstUniqChar(String s) {
        int index = -1;
        ArrayList<Character> charr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            charr.add(s.charAt(i));
        }
        for (int i = 0; i < charr.size(); i++) {
            int occurr = Collections.frequency(charr, s.charAt(i));
            if (occurr == 1) {
                index = i;
                break;
            }
        }
        return index;
    }

    //optimized
    public static int firstUniqCharopti(String s) {
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(String.valueOf(s.charAt(i)))==s.lastIndexOf(s.charAt(i))) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqCharopti("aabb"));
    }
}
