/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

/**
 *
 * @author faiya
 */
public class VowelSubstringALT {

    public static void main(String[] args) {
        String maxstr = "";
        int maxcnt = -1;
        String m = "caberqiitefg";
        for (int i = 0; i <= m.length() - 5; i++) {
            String temp = m.substring(i, i + 5);
            //System.out.println("Ekhon: ----" + temp);
            int tempcnt = 0;
            for (int j = 0; j < temp.length(); j++) {
                char c = temp.charAt(j);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    tempcnt += 1;
                }
            }
            //System.out.println("point: "+tempcnt);
            if (tempcnt > maxcnt) {
                maxstr = temp;
                maxcnt = tempcnt;
            }
        }
        System.out.println(maxstr);
    }
}
