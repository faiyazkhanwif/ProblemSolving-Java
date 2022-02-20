/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava.thirtydaysofcode;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class D8 {

    public static void main(String[] argh) {
        HashMap<String, Integer> hm = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            hm.put(name, phone);

        }
        while (in.hasNext()) {
            String s = in.next();
            if (!hm.containsKey(s)) {
                System.out.println("Not found");
            } else {
                String res = String.valueOf(hm.get(s));
                System.out.println(s + "=" + res);
            }
        }
        in.close();
    }
}
