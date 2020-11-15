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

public class MarsExploration {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {
        String base = "SOS";
        int strlen = s.length();
        int x = 0;
        int errcount = 0;
        while(x<strlen){
            for (int i = 0; i < 3; i++) {
                if (s.charAt(x)!=base.charAt(i)) {
                    //System.out.println(s.charAt(x));
                    errcount+=1;
                }
                x+=1;
            }
        }
        return errcount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
