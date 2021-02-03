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
public class ReplaceAllSpaces {

    public static String replace(String a, String b) {
        String maintxt = a;
        String res="";
        for (int i = 0; i < maintxt.length(); i++) {
            if (maintxt.charAt(i)==' ') {
                res=res+b;
            }else{
                res+=String.valueOf(maintxt.charAt(i));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(replace("This is a test","ABC"));
    }
}
