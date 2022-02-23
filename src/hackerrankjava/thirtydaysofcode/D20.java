/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class D20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int temp = 0, count = 0;
        
        for(int l=0;l<n;l++){
            for(int j=0;j<n-1-l;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
        }
       System.out.println("Array is sorted in " + count + " swaps."); 
       int first = arr[0];
       int last = arr[n-1];
       System.out.println("First Element: " + first); 
       System.out.print("Last Element: "+last); 
    }
}
