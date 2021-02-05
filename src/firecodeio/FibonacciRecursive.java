/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio;

/**
 *
 * @author faiya
 */
public class FibonacciRecursive {

    public static int fib(int n) {
        if (n > 1) {
            return fib(n - 1) + fib(n - 2);
        } else if (n == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
