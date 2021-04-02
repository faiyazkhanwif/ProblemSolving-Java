/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.stack;

/**
 *
 * @author faiya
 */
public class RemoveOutermostParentheses {

    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == '(' && count++ > 0) {
                sb.append(c);
            }
            if (c == ')' && --count > 0) {
                sb.append(c);
            }

        }

        return sb.toString();
    }
}
