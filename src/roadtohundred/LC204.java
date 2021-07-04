/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

/**
 *
 * @author faiya
 */

//sieve of eratosthenes
public class LC204 {

    public static int countPrimes(int n) {
        int primecount = 0;
        boolean[] arr = new boolean[n+1]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        for (int i = 2; i*i < n; i++) {
            if (arr[i]==true) {
                for (int j = 2; j*i < n; j++) {
                    arr[j*i] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (arr[i]==true) {
                primecount++;
            }
        }
        return primecount;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
