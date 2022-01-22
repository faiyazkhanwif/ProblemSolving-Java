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
public abstract class LC278 {
       abstract boolean isBadVersion(int version);
       public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(isBadVersion(mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return end+1;
    } 
}
