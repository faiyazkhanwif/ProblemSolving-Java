/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author faiya
 */
public class Fizzbuzz {

    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%3==0 && i%5==0) {
                res.add("FizBuzz");
            }else if (i%3==0 && i%5!=0){
                res.add("Fizz");
            }else if (i%3!=0 && i%5==0){
                res.add("Buzz");
            }else{
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}
