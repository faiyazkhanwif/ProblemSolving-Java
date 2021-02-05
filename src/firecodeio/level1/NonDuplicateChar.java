/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level1;

/**
 *
 * @author faiya
 */
public class NonDuplicateChar {

    public static Character firstNonRepeatedCharacter(String str) {
        String x = str;
        //System.out.println(x);
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            char temp = x.charAt(i);
            //System.out.println("Checking: " + temp);
            for (int j = 0; j < x.length(); j++) {
                if (temp == x.charAt(j) && i!=j) {
                    //System.out.println("temp = "+temp);
                    //System.out.println("x.charAt(j)= "+x.charAt(j));
                    count += 1;
                }
            }
            if (count == 0) {
                return temp;
            } else {
                count = 0;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("aaaa"));
    }
}
