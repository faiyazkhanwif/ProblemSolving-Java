/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Stack;

/**
 *
 * @author faiya
 */
public class Test {

    public static void main(String[] args) {
        String [] st = new String [3];
        st[0] = "pw";
        st[1] = "gj";
        st[2] = "af";
        Arrays.sort(st);
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);
        }   
        
        String g = "z";
        String h = "a";
        System.out.println(g.compareTo(h));
    }

}
