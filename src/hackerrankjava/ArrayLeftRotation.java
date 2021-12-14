/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.util.List;

/**
 *
 * @author faiya
 */
public class ArrayLeftRotation {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int myswitch = 0;
        int ind = 0;
        while (myswitch!=d) {
            a.add(a.get(ind));
            a.remove(ind);
            myswitch++;
        }
        return a;
    }
}
