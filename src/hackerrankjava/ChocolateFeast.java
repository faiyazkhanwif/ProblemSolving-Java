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

public class ChocolateFeast {

    // Complete the chocolateFeast function below.
    static int chocolateFeast(int n, int c, int m) {
        int money = n;
        int price = c;
        int wrapperch = m;
        int choceaten = n/c;
        //System.out.println("ate initially: "+choceaten);
        int initwrap = n/c;
        boolean x = true;
        while (x == true){
            if (initwrap>=wrapperch) {
                int temp = initwrap/wrapperch;
                choceaten+=temp;
                //System.out.println("total eaten: "+choceaten);
                initwrap = initwrap-(temp*wrapperch);
                initwrap+=temp;
                //System.out.println("wrap collected: "+initwrap);
            }else{
                x = false;
            }
        }
        return choceaten;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] ncm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(ncm[0]);

            int c = Integer.parseInt(ncm[1]);

            int m = Integer.parseInt(ncm[2]);

            int result = chocolateFeast(n, c, m);
            
            System.out.println(result);

            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
