/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class LC290 {

    public static boolean wordPattern(String pattern, String s) {
        if (pattern.length() == 0 && s.length() != 0) {
            return false;
        }
        HashMap<String, Character> hm = new HashMap<>();
        HashMap<Character, Boolean> hm1 = new HashMap<>();
        int spacecount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(" ")) {
                spacecount++;
            }
        }
        if (spacecount!=pattern.length()-1) {
            return false;
        }
        String temp = "";
        int pind = 0;
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(" ")|| i==s.length()-1) {
                if (i==s.length()-1) {
                    temp+=s.charAt(i);
                    
                }
                System.out.println(temp);
                if (hm.containsKey(temp)) {
                    //System.out.println(pind);
                    if (!hm.get(temp).equals(pattern.charAt(pind))) {
                        //System.out.println(hm.get(temp));
                        //System.out.println(pattern.charAt(pind));
                        //System.out.println("line 33");
                        return false;
                    }
                } else {
                    if (hm1.containsKey(pattern.charAt(pind))) {
                        return false;
                    } else {
                        hm.put(temp, pattern.charAt(pind));
                        hm1.put(pattern.charAt(pind), true);
                    }
                }
                temp = "";
                pind++;
                
            } else {
                temp += s.charAt(i);
            }
        }
        //System.out.println(spacecount);
        return true;
    }
    public static void main(String[] args) {
        System.out.println(wordPattern("jquery","jquery"));
    }
}
