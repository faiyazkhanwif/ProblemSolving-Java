/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author faiya Hint: HashSet is not index based as ArrayList that is why there
 * is no order in HashSet. and HashSet does not accept duplications of elements,
 * but in ArrayList duplication is allowed. Hint: In order to print HashSet
 * elements you can use Iterator or you can use for-each loop. the same thing
 * acceptable for ArrayList
 */
public class JavaHashSet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<String> hshs = new HashSet<>();
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        for (int i = 0; i < pair_left.length; i++) {
            hshs.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(hshs.size());
        }
    }
}
