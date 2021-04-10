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
public class MinimumAddToMakeParenthesisValid {

    static int minAddToMakeValid(String S) {
        if (S.length() == 0) {
            return 0;
        }
        char[] str = S.toCharArray();
        Stack<Character> st = new Stack<>();
        st.push(str[0]);
        for (int i = 1; i < str.length; i++) {
            if (st.size() == 0) {
                st.push(str[i]);
            } else if (st.peek() == '(' && str[i] == ')') {
                st.pop();
            } else {
                st.push(str[i]);
            }
        }
        return st.size();
    }

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("()))(("));
    }
}
