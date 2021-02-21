/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class MakeTwoArrEQ {

    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }
        HashMap<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < target.length; i++) {
            int temp = target[i];
            int count = 0;
            for (int j = 0; j < target.length; j++) {
                if (i != j && temp == target[j]) {
                    count++;
                }
            }
            hm.put(temp, count);
        }

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && temp == arr[j]) {
                    count++;
                }
            }
            if (hm.get(temp)==null) {
                return false;
            }
            int comp = hm.get(temp);
            if (comp != count) {
                return false;
            }
        }

        return true;
    }
}
