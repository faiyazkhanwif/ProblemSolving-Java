/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class SubstringComp {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s;
        String largest = "";
        for (int i = 0; i < s.length()-(k-1); i++) {
            String temp="";
            for (int j = i; j < i+k; j++) {
                String x = String.valueOf(s.charAt(j));
                temp+=x;
            }
            System.out.println(temp);
            if (temp.compareTo(smallest)<0) {
                smallest = temp;
            }
            if (temp.compareTo(largest)>0){
                largest = temp;
            }
        }
        System.out.println("--------");
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
