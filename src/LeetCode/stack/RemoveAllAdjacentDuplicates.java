/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.stack;

import java.util.Stack;

/**
 *
 * @author faiya
 */
public class RemoveAllAdjacentDuplicates {

    static String removeDuplicates(String S) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            System.out.println(S.charAt(i));
            if (st.size() == 0) {
                st.push(S.charAt(i));
            } else if (st.peek() == S.charAt(i)) {
                st.pop();
            } else {
                st.push(S.charAt(i));
            }
        }
        String res = "";
        if (st.size() == 0) {
            return res;
        } else {
            while (st.size() != 0) {
                String temp = Character.toString(st.pop());
                res = temp + res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbbabaaa"));
    }
}
