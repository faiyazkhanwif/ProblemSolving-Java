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
public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        if (N%2!=0) {
            System.out.println("Weird");
        }else{
            if (N>=2 && N<=5) {
                System.out.println("Not Weird");
            }else if (N>=6 && N<=20){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
        }

        bufferedReader.close();
    }
}
