/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.algo;

/**
 *
 * @author faiya
 */
public class LC374 {

    public int guess(int mid){
        return 0;
    }
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        
        while (start<=end){
            int mid = start + (end-start)/2;
            if(guess(mid)==0){
                return mid;
            }else if(guess(mid)==-1){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        
        return -1;
    }
}
