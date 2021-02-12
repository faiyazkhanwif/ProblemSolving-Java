/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level2;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
//Interview Question from Oracle.
public class CoupleSum {

    /*
    public static int[] coupleSum(int[] numbers, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            hm.put(target-numbers[i], i+1);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (hm.containsKey(numbers[i])) {
                res[1] = (int)hm.get(numbers[i]);
                res[0] = i+1;
                return res;
            }
        }
        return res;
    }
     */
    public static int[] coupleSum(int[] numbers, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (hm.containsKey(target-numbers[i])) {
                res[0] = (int)hm.get(target-numbers[i]);
                res[1] = i+1;
                return res;
            }else{
                hm.put(numbers[i], i+1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 11, 25};
        int[] res = coupleSum(arr, 20);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
