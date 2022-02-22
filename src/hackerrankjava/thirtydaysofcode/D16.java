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
public class D16 {

    public static void main(String[] args)throws IOException  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();
        bufferedReader.close();
        try {
            System.out.println(Integer.valueOf(S));
        } catch(NumberFormatException ex)  {
            System.out.println("Bad String");
        }

    }
}
