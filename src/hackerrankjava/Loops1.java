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
public class Loops1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            int ans = i*N;
            System.out.println(N+" x "+i+" = "+ans);
        }
    }
}
