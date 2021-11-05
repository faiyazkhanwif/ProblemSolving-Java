/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars.fundamentals;

/**
 *
 * @author faiya
 */
public class Mumbling {
    
    public static String accum(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            //System.out.println("char: " + String.valueOf(s.charAt(i)));
            int start = 1;
            
            for (int j = 0; j < i + 1; j++) {
                String charac = String.valueOf(s.charAt(i));
                if (start == 1) {
                    res += charac.toUpperCase();
                    start = 0;
                } else {
                    res += charac.toLowerCase();
                }
            }
            //System.out.println("res: " + res);
            if (i != s.length() - 1) {
                res+="-";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(accum("cwAt"));
    }
}
