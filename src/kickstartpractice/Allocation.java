/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickstartpractice;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class Allocation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int j = 0; j < t; j++) {
            int n = in.nextInt();
            int b = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            //System.out.println("------------------");
            //for (int i = 0; i < n; i++) {
            //    System.out.print(arr[i]+" ");
            //}
            //System.out.println("");
            int ans = 0;
            int p = 0;
            int count = 0;
            while (ans <= b) {
                if (p == n) {
                    break;
                }
                ans += arr[p];
                if (ans <= b) {
                    count++;
                    p++;
                }
            }
            System.out.println("Case #" + (j + 1) + ": " + (count));
        }

    }
}
