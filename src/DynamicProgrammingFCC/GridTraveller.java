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
//Memoization
public class GridTraveller {

    /*
   //Recursive solution
    static int gt(int m, int n) {
        if (m == 1 && n == 1) {
            return 1;
        }
        if (m == 0 || n == 0) {
            return 0;
        }
        return gt(m - 1, n) + gt(m, n - 1);
    }
     */
    static int gt(int m, int n, HashMap memo) {
        if (m == 1 && n == 1) {
            return 1;
        }
        if (m == 0 || n == 0) {
            return 0;
        }
        String key = m+","+n;
        if (memo.containsKey(key)) {
            return (int) memo.get(key);
        }
        memo.put(key, gt(m - 1, n, memo) + gt(m, n - 1, memo));
        return (int) memo.get(key);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        System.out.println(gt(15, 15, hm));
    }

}
