/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class Map {

    public static void main(String[] argh) {
        HashMap<String, Integer> hm = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            hm.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (hm.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s+"="+hm.get(s));
            }
        }
    }
}
