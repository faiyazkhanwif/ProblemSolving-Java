/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author faiya
 */
public class StackBrackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                if (!st.isEmpty()) {
                    switch (input.charAt(i)) {
                        case '}':
                            if (st.peek() == '{') {
                                st.pop();
                            }
                            break;
                        case ']':
                            if (st.peek() == '[') {
                                st.pop();
                            }
                            break;
                        case ')':
                            if (st.peek() == '(') {
                                st.pop();
                            }
                            break;
                        default:
                            st.push(input.charAt(i));
                    }
                } else {
                    st.push(input.charAt(i));
                }
            }
            System.out.println(st.isEmpty());
        }
    }
}
