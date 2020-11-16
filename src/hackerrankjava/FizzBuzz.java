/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author faiya
 */
//Manual fizzbuzz without math logic
public class FizzBuzz {

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            String res = "";
            String ch = "novalue";
            if (i == 3 && i == 5) {
                res = "FizzBuzz";
                ch = "hasvalue";
            } else if (i < 3 && i < 5) {
                ch = "novalue";
            } else {
                int mult = 0;
                int mulf = 0;
                int j = 1;
                int k = 1;
                boolean keyt = true;
                boolean keyf = true;

                while (keyt == true) {
                    mult = j * 3;
                    j++;
                    if (mult == i) {
                        ch = "hasvalue";
                        res += "Fizz";
                        keyt = false;
                        break;
                    } else if (mult > i) {
                        keyt = false;
                        break;
                    }
                }
                while (keyf == true) {
                    mulf = k * 5;
                    k++;
                    if (mulf == i) {
                        ch = "hasvalue";
                        res += "Buzz";
                        keyf = false;
                        break;
                    } else if (mulf > i) {
                        keyf = false;
                        break;
                    }
                }
            }
            if (ch == "novalue") {
                System.out.println(i);
            } else {
                System.out.println(res);
                res = "";
            }

        }

    }
}

class Solution {

    public static void main(String[] args) {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());
        //Result.fizzBuzz(n);
        //bufferedReader.close();
        FizzBuzz fb = new FizzBuzz();
        fb.fizzBuzz(15);
    }
}
