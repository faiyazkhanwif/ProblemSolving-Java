/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author faiya
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> ll = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ll.add("FizzBuzz");
            } else if (i % 5 == 0) {
                ll.add("Buzz");
            } else if (i % 3 == 0 ) {
                ll.add("Fizz");
            } else {
                ll.add(String.valueOf(i));
            }
        }
        return ll;
    }
}
