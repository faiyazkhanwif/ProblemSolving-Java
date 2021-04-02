/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.stack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author faiya
 */
public class BuildArrayStackOperations {

    public List<String> buildArray(int[] target, int n) {
        int ind = 0;
        int count = 0;
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (count >= target.length) {
                break;
            }
            if (i != target[ind]) {
                res.add("Push");
                res.add("Pop");
            } else {
                res.add("Push");
                count++;
                ind++;
            }
        }
        return res;
    }
}
