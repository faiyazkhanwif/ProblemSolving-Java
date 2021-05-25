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
public class ShuffleString {

    public static String restoreString(String s, int[] indices) {
        String res  = "";
        char [] ans = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]] = s.charAt(i);
        }
        //for (int i = 0; i < ans.length; i++) {
        //    System.out.println(ans[i]);
        //    res+=String.valueOf(ans[i]);
        //}
        res = String.valueOf(ans);
        return res;
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int [] in = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,in));
    }
}
