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
public class D6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nm = in.nextInt();
        for (int j = 0; j < nm; j++) {
            String S = in.next();
            String m = "";
            String n = "";
            boolean btn = true;
            for (int i = 0; i < S.length(); i++) {
                if (i % 2 != 0) {
                    n += String.valueOf(S.charAt(i));
                } else {
                    m += String.valueOf(S.charAt(i));
                }
            }
            System.out.println(m + " " + n);
        }

    }
}
