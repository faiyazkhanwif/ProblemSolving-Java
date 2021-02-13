/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author faiya
 */
public class RemoveDuplicatesFromList {

    public static ArrayList<String> removeDuplicates(List<String> input) {
        Set<String> st = new TreeSet<>();
        for (int i = 0; i < input.size(); i++) {
            st.add(input.get(i));
        }
        ArrayList<String> ar = new ArrayList<>(st);
        return ar;
    }
    
    public static void main(String[] args) {
        List<String> lt = new ArrayList<>();
        lt.add("hi");
        lt.add("hello");
        lt.add("hi");
        lt.add("hi");
        lt.add("hi");
        lt.add("hehe");
        System.out.println(removeDuplicates(lt));
    }
}
