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
public class JavaOutputFormatting {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int ls = s1.length();
                int sln = 15-ls;
                String spaces = String.format("%"+sln+"s", "");
                
                int x=sc.nextInt();
                String zeros = String.format("%03d",x);
                System.out.println(s1+spaces+zeros);
            }
            System.out.println("================================");
    }
}

