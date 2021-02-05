/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio;

/**
 *
 * @author faiya
 */
// Interview question from Microsoft.
public class UniqueChars {

    public static boolean areAllCharactersUnique(String str) {
        if (str==null || str=="") {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = 0; j < str.length(); j++) {
                if (i==j) {
                    break;
                }else{
                    if (str.charAt(i)==str.charAt(j)) {
                        count++;
                    }
                }
            }
            if (count>1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(areAllCharactersUnique("aa"));
    }
}
