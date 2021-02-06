/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level1;

/**
 *
 * @author faiya
 */
//Interview Question from Oracle
public class BinarySearchWithTargetInteger {

    public static Boolean binarySearch(int[] arr, int n) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (arr[mid] == n) {
                return true;
            }else if (arr[mid] > n){
                end = mid-1;
                //System.out.println("end: "+end);
            }else{
                start = mid+1;
                //System.out.println("start: "+start);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,7,8,9};
        System.out.println(binarySearch(arr,9));
    }
}
