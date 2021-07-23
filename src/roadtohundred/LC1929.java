/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

/**
 *
 * @author faiya
 */
public class LC1929 {

    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i+(nums.length)] = nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
