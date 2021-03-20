/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickstartpractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class StudentTraining {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int p = in.nextInt();
            Integer[] skillar = new Integer[n];
            for (int j = 0; j < n; j++) {
                skillar[j] = in.nextInt();
            }
            Arrays.sort(skillar, Collections.reverseOrder());
            //System.out.println("-------------------");
            //for (int j = 0; j < skillar.length; j++) {
            //    System.out.print(skillar[j]+" ");
            //}
            //System.out.println(" ");
            int max = skillar[0];
            if (p == n) {
                int hr = 0;
                for (int j = 1; j < n; j++) {
                    hr += (max - skillar[j]);
                }
                System.out.println("Case #"+(i+1)+": "+hr);
            } else {
                int start = 0;
                int end = p - 1;
                int maxhr = Integer.MAX_VALUE;
                while (end < n) {
                    int hr = 0;
                    for (int j = start; j <= end; j++) {
                        int maxc = skillar[start];
                        //System.out.println("max curr: "+ maxc);
                        hr += (maxc-skillar[j]);
                    }
                    if (hr<maxhr) {
                        maxhr = hr;
                    }
                    start++;
                    end++;
                }
                System.out.println("Case #"+(i+1)+": "+maxhr);
            }
        }
    }
}
