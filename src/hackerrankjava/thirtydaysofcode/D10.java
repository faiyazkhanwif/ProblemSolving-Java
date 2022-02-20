/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava.thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author faiya
 */
public class D10 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String binres = "";
        int maxconones = 0;
        int onecount = 0;
        while (n != 0) {
            int rem = n % 2; // 0 1 1
            binres = String.valueOf(rem) + binres; // 0 1 1
            n = n / 2;
        }
        for (int i = 0; i < binres.length(); i++) {
            if (binres.charAt(i) == '0') {
                if (onecount > maxconones) {
                    maxconones = onecount;
                }
                onecount = 0;
            } else {
                onecount++;
            }
            if (i == binres.length() - 1 && onecount > maxconones) {
                maxconones = onecount;
            }
        }

        //System.out.println(binres);
        System.out.println(maxconones);
        
        bufferedReader.close();
    }
}
