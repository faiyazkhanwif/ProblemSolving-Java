/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class NegativeSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] yourArray = new int[n];
        for (int i = 0; i < n; i++) {
            yourArray[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < yourArray.length; i++) {
            // j is the number of elements which should be printed
            for (int j = i; j < yourArray.length; j++) {
                int temp = 0;
                // print the array from i to j
                for (int k = i; k <= j; k++) {
                    temp += yourArray[k];
                    //System.out.print(yourArray[k]);
                }
                if (temp < 0) {
                    count += 1;
                }
                //System.out.println();
            }
        }
        System.out.println(count);
    }
}
