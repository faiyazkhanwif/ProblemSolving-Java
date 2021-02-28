/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.weekly230;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author faiya
 */
public class CountItemsMatchingRule {

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        List<List<String>> mylist = new ArrayList<>(items);
        int temp = 0;
        if (ruleKey.equalsIgnoreCase("type")) {
            temp = 0;
        }else if (ruleKey.equalsIgnoreCase("color")){
            temp = 1;
        }else{
            temp = 2;
        }
        int count = 0;
        for (int i = 0; i < mylist.size(); i++) {
            List<String> ml = new ArrayList<>(mylist.get(i));
            if (ml.get(temp).equalsIgnoreCase(ruleValue)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<List<String>> temp = new LinkedList();
        List<String> temp1 = new LinkedList();
        temp1.add("phone");
        temp1.add("blue");
        temp1.add("pixel");
        List<String> temp2 = new LinkedList();
        temp2.add("computer");
        temp2.add("silver");
        temp2.add("lenovo");
        List<String> temp3 = new LinkedList();
        temp3.add("phone");
        temp3.add("gold");
        temp3.add("iphone");
        temp.add(temp1);
        temp.add(temp2);
        temp.add(temp3);
        String rk = "color";
        String rv = "silver";
        System.out.println(countMatches(temp,rk,rv));
    }
}
