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
public class BaseBallGame {

    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            if ("+".equals(ops[i])) {
                int temp1 = st.pop();
                int temp2 = st.peek();
                st.push(temp1);
                st.push(temp1 + temp2);
            } else if ("D".equals(ops[i])) {
                int temp = st.peek();
                st.push(temp * 2);
            } else if ("C".equals(ops[i])) {
                st.pop();
            } else {
                st.push(Integer.valueOf(ops[i]));
            }
        }
        int ans = 0;
        int size = st.size();
        for (int i = 0; i < size; i++) {
            ans += st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
