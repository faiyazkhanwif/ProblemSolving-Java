/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

import java.util.Stack;

/**
 *
 * @author faiya
 */
public class LC155 {

    class MinStack {

        Stack<Integer> st;
        Stack<Integer> min;

        public MinStack() {
            st = new Stack<>();
            min = new Stack<>();
        }

        public void push(int val) {

            if (st.size() == 0) {
                min.add(val);
                st.add(val);
            } else {
                st.add(val);
                if (val <= min.peek()) {
                    min.push(val);
                }
            }
        }

        public void pop() {
            int val = st.pop();
            if (val == min.peek()) {
                min.pop();
            }
        }

        public int top() {
            if (st.peek() != null) {
                return st.peek();
            } else {
                return 0;
            }
        }

        public int getMin() {
            if (min.size() != 0) {
                return min.peek();
            } else {
                return 0;
            }
        }
    }
}
