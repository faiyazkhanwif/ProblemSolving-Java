/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author faiya
 */
public class D28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String emailRegEx = ".+@gmail\\.com$";
        Pattern emailPattern = Pattern.compile(emailRegEx);
        ArrayList<String> alist = new ArrayList<>(); 
        for (int i = 0; i < n; i++) {
            String name = in.next();
            String email = in.next();
            Matcher matcher = emailPattern.matcher(email);
            if (matcher.find()) {
                alist.add(name);
            }
        }
        Collections.sort(alist);
        
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
        }
    }
}
