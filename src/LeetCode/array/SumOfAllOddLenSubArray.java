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
public class SumOfAllOddLenSubArray {

    static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //System.out.println("---------------------------");
            //System.out.println("i= "+i );
            for (int j = i; j < arr.length; j++) {
                //System.out.println("j= "+j );
                int[] temp = new int[j-i+1];
                int ind = 0;
                for (int k = i; k <= j; k++) {
                    temp[ind] = arr[k];
                    ind++;
                }
                ind = 0;
                if (temp.length%2!=0) {
                    for (int k = 0; k < temp.length; k++) {
                        sum +=temp[k];
                    }
                    //System.out.println(sum);
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr [] = {10,11,12};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}
