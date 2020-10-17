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
public class Loops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp = a;
            int key = 1;
            for (int j = 1; j <= n; j++) {
                //System.out.println("key: "+key);
                //System.out.println(j);
                int ans = temp+key*b;
                key = key*2;
                System.out.print(ans+" ");
                temp = ans;
            }
            System.out.println("");
        }
        in.close();
    }
}
