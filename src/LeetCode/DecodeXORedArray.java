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
public class DecodeXORedArray {

    public int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length+1];
        ans[0] = first;
        int count = 1;
        for (int i = 0; i < encoded.length; i++) {
            ans[count] = encoded[i]^ans[count-1];
            count++;
        }
        return ans;
    }
}
