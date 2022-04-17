/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author faiya
 */
public class randtest {

    static String test() {
        InputStreamReader istream = new InputStreamReader(System.in);
        BufferedReader bufRead = new BufferedReader(istream);
        System.out.println("Marking System");
        try {

            System.out.println("Please Enter In Your First Name: ");
            String firstName = bufRead.readLine();
            System.out.println("Please Enter a Mark ");
            String mark = bufRead.readLine();
            int num = Integer.parseInt(mark);
            if (num > 90) {
                return "You earned an A";
            } else if (num > 80) {
                return "You earned a B";
            } else if (num > 70) {
                return "You earned a C";
            } else {
                return "You earned a D";
            }
        } catch (IOException err) {
            return "Error reading line";
        } catch (NumberFormatException err) {
            return "Error Converting Number";
        }
    }

    public static void main(String args[]) {
        String res = test();
        System.out.println(res);
        System.out.println(Integer.MAX_VALUE);
    }
}
