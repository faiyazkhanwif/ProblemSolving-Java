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
public class D25 {
    
    //Misses test case 8
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            //System.out.println("Num: "+num);
            if (num == 1) {
                System.out.println("Not prime");
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(num); j++) {
                //System.out.println("-------"+j);
                int rem = num%j;
                //System.out.println("------- rem:"+rem);
                if(rem==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
    }
}
