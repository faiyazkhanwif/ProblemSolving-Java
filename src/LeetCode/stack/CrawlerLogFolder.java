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
public class CrawlerLogFolder {

    static int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();

        // iterate through the input string
        for (String s : logs) {
			// if the input is "../" then pop the stack unless the stack is empty
            if (s.equals("../")) {
                if (!st.isEmpty()) {
                    st.pop();   
                } 
			// do nothing if the input is "./" otherwise push to the stack
            } else if (!s.equals("./")) {
                st.push(s);
            }
        }
        return st.size();
    }

    public static void main(String[] args) {
        String[] str = {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(str));
    }
}
