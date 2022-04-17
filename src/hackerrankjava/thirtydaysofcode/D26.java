/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class D26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Actual Date
        int a_day = scan.nextInt();
        int a_month = scan.nextInt();
        int a_year = scan.nextInt();

        // Expected return date
        int e_day = scan.nextInt();
        int e_month = scan.nextInt();
        int e_year = scan.nextInt();

        int fine = 0;

        if (a_year < e_year) { //Returned before expected year
            fine = 0;
        } else {
            if (a_year > e_year) {   // returned after expected year
                fine = 10000;
            } else if (a_month > e_month) {    // returned after expected month
                fine = 500 * (a_month - e_month);
            } else if (a_day > e_day) {     // returned after expected day
                fine = 15 * (a_day - e_day);
            }
        }
        System.out.println(fine);
    }
}
