/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava.thirtydaysofcode;

/**
 *
 * @author faiya
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {

    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elements) {
        this.elements = elements;
    }

    /*
    public void computeDifference() {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                if (i == j) {
                    continue;
                }
                int temp = Math.abs(elements[i] - elements[j]);
                if (temp > max) {
                    max = temp;
                }
            }
        }
        maximumDifference = max;
    }
     */
    //Optimized O(nlog(n))
    public void computeDifference() {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                if (i == j) {
                    continue;
                }
                int temp = Math.abs(elements[i] - elements[j]);
                if (temp > max) {
                    max = temp;
                }
            }
        }
        maximumDifference = max;
    }

} // End of Difference class

public class D14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
