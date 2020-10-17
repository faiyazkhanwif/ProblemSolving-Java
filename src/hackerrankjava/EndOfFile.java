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
public class EndOfFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=1;
        while (in.hasNext()){
                String s = in.nextLine();
                System.out.println(i+" "+s);
            i++;
            }
        }
    }
