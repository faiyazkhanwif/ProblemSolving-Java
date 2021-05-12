/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author faiya
 */
public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return null;
        } else if (numRows == 1) {
            List<Integer> vl = new ArrayList<>();
            vl.add(1);
            res.add(vl);
            return res;
        } else if (numRows == 2) {
            List<Integer> v0 = new ArrayList<>();
            v0.add(1);
            res.add(v0);
            List<Integer> vl = new ArrayList<>();
            vl.add(1);
            vl.add(1);
            res.add(vl);
            return res;
        } else {
            List<Integer> v0 = new ArrayList<>();
            v0.add(1);
            res.add(v0);
            int count = 0;
            List<Integer> vl = new ArrayList<>();
            vl.add(1);
            vl.add(1);
            res.add(vl);
            count++;
            for (int i = 0; i < numRows - 2; i++) {
                List<Integer> checker = res.get(count);
                List<Integer> val = new ArrayList<>();
                val.add(1);
                int m = 0;
                int n = m+1;
                while(n!=checker.size()){
                    int value = checker.get(m)+checker.get(n);
                    val.add(value);
                    m++;
                    n++;
                }
                val.add(1);
                res.add(val);
                count++;
            }
            return res;
        }
    }
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
