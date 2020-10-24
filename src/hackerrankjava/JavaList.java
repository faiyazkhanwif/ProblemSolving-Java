/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class JavaList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList x = new ArrayList();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            x.add(in.nextInt());
        }
        int q = in.nextInt();
        int cnt = 0;
        while (cnt < q) {
            //System.out.println(cnt);
            String qr = in.next();
            //System.out.println(qr);
            if ("Insert".equals(qr)) {
                x.add(in.nextInt(), in.nextInt());
            }
            if ("Delete".equals(qr)) {
                x.remove(in.nextInt());
            }
            cnt++;
            //System.out.println(x);
        }
        for (int i = 0; i < x.size(); i++) {
            System.out.print(x.get(i)+" ");
        }
        
    }
}
