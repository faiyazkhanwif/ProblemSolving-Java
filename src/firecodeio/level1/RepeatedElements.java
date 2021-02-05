/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author faiya
 */
//Interview question from Bloomberg.
public class RepeatedElements {

    public static String duplicate(int[] numbers) {
        ArrayList res = new ArrayList();
        int ind = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            int temp = numbers[i];
            int count = 1;
            for (int j = i+1; j < numbers.length; j++) {
                if (temp == numbers[j]) {
                    count++;
                }
            }
            if (count>1) {
                //System.out.println(temp);
                res.add(temp);
                count = 1;
            }
        }
        Collections.sort(res);
        return res.toString();
    }

    public static void main(String[] args) {
        int [] test = {1,3,4,2,1};
        System.out.println(duplicate(test));
    }
}
