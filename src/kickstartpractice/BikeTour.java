/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickstartpractice;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class BikeTour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            //System.out.println("-----------------");
            //for (int j = 0; j < n; j++) {
            //    System.out.print(arr[j]+" ");
            //}
            //System.out.println("");
            int count = 0;
            for (int j = 1; j < n-1; j++) {
                if (j==n-1) {
                    break;
                }
                //System.out.println("Ekhane arr[j]= "+arr[j]);
                if (arr[j]>arr[j-1] && arr[j]>arr[j+1]) {
                    //System.out.println("hello");
                    count++;
                }
            }
            
            System.out.println("Case #"+(i+1)+": "+count);
            
        }
        
    }
}
