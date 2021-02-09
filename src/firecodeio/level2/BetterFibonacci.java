/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level2;

/**
 *
 * @author faiya
 */
//Interview Question from twitter
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34
public class BetterFibonacci {

    public static int betterFibonacci(int n) {
        if (n==0) {
            return 0;
        }
        int prev = 0;
        int curr = 1;
        for (int i = 0; i < n-1; i++) {
            int next = prev+curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
    public static void main(String[] args) {
        System.out.println(betterFibonacci(15));
    }
}
