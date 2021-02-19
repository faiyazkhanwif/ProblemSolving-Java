/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgrammingFCC;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class FibonacciDP {

    static int fib(int n, HashMap memo) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return (int) memo.get(n);
        }
        memo.put(n, fib(n - 1, memo) + fib(n - 2, memo));
        return (int) memo.get(n);
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        System.out.println(fib(40,hm));
    }
}
