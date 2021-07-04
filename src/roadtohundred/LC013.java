/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class LC013 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        if (s.length() == 0) {
            return -1;
        }
        int res = 0;
        int i = 0;
        while (i < s.length()) {
            int curr = hm.get(s.charAt(i));
            if (i + 1 != s.length()) {
                int next = hm.get(s.charAt(i + 1));

                if (curr >= next) {
                    res += curr;
                    i++;
                } else if (curr < next) {
                    res += (next - curr);
                    i += 2;
                }
            }else{
                res+=curr;
                i++;
            }
        }
        return res;
    }
}
