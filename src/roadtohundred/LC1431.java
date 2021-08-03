/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author faiya
 */
public class LC1431 {
 public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = getMax(candies);
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i]+extraCandies)>=max) {
                max = candies[i];
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}
