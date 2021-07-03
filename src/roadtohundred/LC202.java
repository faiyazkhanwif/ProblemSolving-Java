/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

import java.util.HashSet;

/**
 *
 * @author faiya
 */
public class LC202 {

    public static boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        boolean happy = false;
        int value = n;
        while (happy == false) {
            System.out.println(value);
            String str = String.valueOf(value);
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                int num = Integer.valueOf(String.valueOf(str.charAt(i)));
                sum += (num * num);
            }
            if (hs.contains(sum)) {
                return false;
            } else if (sum == 1) {
                return true;
            } else {
                hs.add(sum);
                value = sum;
            }
        }
        return happy;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}