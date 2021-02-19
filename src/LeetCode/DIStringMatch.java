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
public class DIStringMatch {

    static int[] diStringMatch(String S) {
        int n = S.length();
        int inc = 0;
        int dec = S.length();
        int[] res = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == 'I') {
                res[i] = inc;
                inc++;
                if (i == n - 1) {
                    res[i+1] = inc;
                }
            } else if (S.charAt(i) == 'D') {
                res[i] = dec;
                dec--;
                if (i == n - 1) {
                    res[i+1] = dec;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] ans = diStringMatch("IDID");
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
