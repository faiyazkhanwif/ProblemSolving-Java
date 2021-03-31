/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.array;

/**
 *
 * @author faiya
 */
public class FindHighestAltitude {

    public int largestAltitude(int[] gain) {
        //int arr[] = new int[gain.length+1];
        //arr[0] = 0;
        int ind = 1;
        int alt = 0;
        int res = alt;
        for (int i = 1; i < gain.length; i++) {
            alt = gain[i-1]+alt;
            if (alt>res) {
                res = alt;
            }
        }
        alt = gain[gain.length-1]+alt;
        if (alt>res) {
            res = alt;
        }
        return res;
    }
}
