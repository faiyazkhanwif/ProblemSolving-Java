/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level2;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
//Interview question from Salesforce
public class IsomorphicString {

    public static boolean isIsomorphic(String input1, String input2) {
        if (input1 == input2) {
            return true;
        }
        HashMap<Character, Character> hs = new HashMap<Character, Character>();
        HashMap<Character, Character> hs2 = new HashMap<Character, Character>();
        for (int i = 0; i < input1.length(); i++) {
            hs.put(input1.charAt(i), input2.charAt(i));
        }
        for (int i = 0; i < input2.length(); i++) {
            hs2.put(input2.charAt(i), input1.charAt(i));
        }
        //System.out.println(hs.size());
        //System.out.println(hs2.size());
        if (hs.size() != hs2.size()) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
    }
}
