/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author faiya
 */
public class LC020 {

    public static boolean isValid(String s) {
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('(', ')');
        hm.put('{', '}');
        hm.put('[', ']');
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (st.size()==0) {
                st.add(s.charAt(i));
                continue;
            }
            if (hm.get(st.peek()) != null && hm.get(st.peek()) == s.charAt(i)) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        if (st.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }
}
