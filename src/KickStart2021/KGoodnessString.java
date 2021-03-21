/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KickStart2021;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class KGoodnessString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            String str = in.next();
            //System.out.println("---------");
            //System.out.println(str);
            int gds = 0;
            for (int j = 0; j < n; j++) {
                if (j < n / 2) {
                    //System.out.println("j = " + j);
                    int temp = n - j - 1;
                    //System.out.println("temp = " + temp);
                    //temp = temp - 1;
                    if (str.charAt(j) != str.charAt(temp)) {
                        //System.out.println(str.charAt(j - 1) + "---------" + str.charAt(temp));
                        gds++;
                    }
                }
            }
            //System.out.println(gds);
            //if (gds >= k) {
            //    System.out.println("Case #" + (i + 1) + ": " + 0);
            //} else {
                int ans = Math.abs(k - gds);
                //double ans2 = (ans/2);
                System.out.println("Case #" + (i + 1) + ": " + (int)Math.ceil(ans));
           // }

        }
    }
}
