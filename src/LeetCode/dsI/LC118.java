/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.dsI;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author faiya
 */
public class LC118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 1) {
            List<Integer> mylist = new ArrayList<>();
            mylist.add(1);
            res.add(mylist);
            return res;
        } else if (numRows > 1) {
            List<Integer> mylist = new ArrayList<>();
            mylist.add(1);
            res.add(mylist);
            List<Integer> mylist2 = new ArrayList<>();
            mylist2.add(1);
            mylist2.add(1);
            res.add(mylist2);
            for (int i = 3; i <= numRows; i++) {
                mylist = res.get(i - 2);
                int ind1 = 0;
                int ind2 = 1;
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j == i - 1) {
                        temp.add(1);
                    } else {
                        temp.add(mylist.get(ind1) + mylist.get(ind2));
                        ind1++;
                        ind2++;
                    }
                }
                res.add(temp);
            }
        }
        return res;
    }
}
