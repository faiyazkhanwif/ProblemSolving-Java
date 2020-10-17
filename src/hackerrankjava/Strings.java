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
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int lA = A.length();
        int lB = B.length();
        System.out.println(lA+lB);
        
        if (A.compareTo(B)>0) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        String AA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String BB = B.substring(0, 1).toUpperCase()+B.substring(1);
        String str= AA+" "+BB;
        System.out.println(str);
    }
}
