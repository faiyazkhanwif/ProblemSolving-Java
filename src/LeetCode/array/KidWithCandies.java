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
public class KidWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> res = new ArrayList<>();
        int maxval = -1;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]>maxval) {
                maxval = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int diff = maxval-candies[i];
            if (diff<=extraCandies) {
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}
