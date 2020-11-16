/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

/**
 *
 * @author faiya
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FunnyString {
    // Complete the funnyString function below.
    static String funnyString(String s) {
        //System.out.println("-----------------------------");
        String base = s;
        String rev = "";
        Integer[] arrbase = new Integer[s.length()];
        Integer[] arrrev = new Integer[s.length()];
        
        String dec = "Funny";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += String.valueOf(s.charAt(i));
        }
        //System.out.println("rev: "+rev);
        for (int i = 0; i < arrbase.length; i++) {
            int asciiv = (int) base.charAt(i);
            int asciiv2 = (int) rev.charAt(i);
            arrbase[i] = asciiv;
            arrrev[i] = asciiv2;
            //System.out.println(arrbase[i]+"-----"+arrrev[i]);
        }
        for (int i = 0; i < arrbase.length-1; i++) {
            int temp = Math.abs(arrbase[i]-arrbase[i+1]);
            int temp2 = Math.abs(arrrev[i]-arrrev[i+1]);
            //System.out.println(temp+"--------"+temp2);
            if (temp!=temp2) {
                dec = "Not Funny";
                break;
            }
        }
        return dec;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);
            System.out.println(result);
            //bufferedWriter.write(result);
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
