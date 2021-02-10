/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level2;

/**
 *
 * @author faiya
 */
//Interview question from visa.
public class Anagrams {

    public static boolean isAnagram(String input1, String input2) {
        if (input1 == null || input2 == null) {
            return false;
        }

        String str1;
        String str2;
        if (input1.length()<input2.length()) {
            str1 = input1;
            str2 = input2;
        }else{
            str2 = input1;
            str1 = input2;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str2.contains(String.valueOf(str1.charAt(i)))) {
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
