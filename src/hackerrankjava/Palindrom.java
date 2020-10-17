/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;


import java.io.*;
import java.util.*;
/**
 *
 * @author faiya
 */
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B = "";
        /* Enter your code here. Print output to STDOUT. */
        for (int i = A.length()-1; i >= 0; i--) {
            String x = String.valueOf(A.charAt(i));
            B = B.concat(x);
        }
        if (A.equals(B)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}



