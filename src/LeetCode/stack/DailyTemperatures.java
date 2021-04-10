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
public class DailyTemperatures {

    static int[] dailyTemperatures(int[] T) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[T.length];
        int pointer = 0;

        while (pointer != T.length - 1) {
            int i = pointer + 1;
            int temp = T[pointer];
            boolean found = false;
            while (i < T.length) {
                if (temp < T[i]) {
                    ans[pointer] = i - pointer;
                    found = true;
                    break;
                }
                i++;
            }
            if (found == false) {
                ans[pointer] = 0;
            }
            pointer++;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] test = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = dailyTemperatures(test);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]+" ");
        }
    }
}
