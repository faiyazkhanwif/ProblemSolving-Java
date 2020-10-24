/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class Anagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] arr = new char[a.length()];
        char[] arr1 = new char[b.length()];
        if (a.length()!=b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            arr[i] = a.charAt(i);
            arr1[i] = b.charAt(i);
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr1[i]) {
                return false;
            } 
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
