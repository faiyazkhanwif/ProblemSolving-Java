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
public class VowelSubstring {

    public static String findSubstring(String s, int k) {
        int prev_count = 0;
        String res = "", string = "";

        char[] array;

        for (int i = 0; i <= s.length() - k; i++) {
            int count = 0;
            string = s.substring(i, i + k);

            array = string.toCharArray();
            for (char c : array) {
                if (isVowel(c)) {
                    count++;
                }
            }
            if (count > prev_count) {
                prev_count = count;
                res = string;

            }

        }
        if (prev_count == 0) {
            return "Not found!";
        } else {
            return res;
        }
    }

    static boolean isVowel(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

}


class main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = VowelSubstring.findSubstring(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
