/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

/**
 *
 * @author faiya
 */
public class OOPtest {
    // arr [1-10] rand
    
    public static void main(String[] args) {
        int [] arr = {1,5,7,3,4,8,9,10,2};
        
        //1
        //
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                //System.out.println(arr[i]);
                if (arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j]; 
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
 }
