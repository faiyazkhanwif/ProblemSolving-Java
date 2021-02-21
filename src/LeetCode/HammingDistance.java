/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author faiya
 */
public class HammingDistance {

    /*OneLiner
    public class Solution {
        public int hammingDistance(int x, int y) {
            return Integer.bitCount(x ^ y);
        }
    }
     */
    static int hammingDistance(int x, int y) {
        String xt = "";
        while (x != 0) {
            xt += String.valueOf(x % 2);
            x = x / 2;
        }
        String ansx = "";
        for (int i = xt.length() - 1; i >= 0; i--) {
            ansx += String.valueOf(xt.charAt(i));
        }
        String yt = "";
        while (y != 0) {
            yt += String.valueOf(y % 2);
            y = y / 2;
        }
        String ansy = "";
        for (int i = yt.length() - 1; i >= 0; i--) {
            ansy += String.valueOf(yt.charAt(i));
        }
        int margh;
        int margl;
        if (ansy.length() >= ansx.length()) {
            margh = ansy.length();
            margl = ansx.length();
        } else {
            margh = ansx.length();
            margl = ansy.length();
        }
        String comp1 = "";
        String comp2 = "";

        for (int i = 0; i < margh - margl; i++) {
            comp1 += "0";
        }

        if (ansx.length() <= ansy.length()) {
            comp1 += ansx;
            comp2 += ansy;
        } else {
            comp1 += ansy;
            comp2 += ansx;
        }

        int ans = 0;
        for (int i = 0; i < comp1.length(); i++) {
            if (comp1.charAt(i) != comp2.charAt(i)) {
                ans++;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }
}
