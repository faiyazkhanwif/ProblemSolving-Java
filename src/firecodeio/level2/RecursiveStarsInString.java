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
//Interview Question from bloomberg
public class RecursiveStarsInString {

    public static String insertPairStar(String s) {
        if (s == "" || s==null || s.length() == 1) {
            return s;
        }
        if (s.charAt(0)==s.charAt(1)) {
            return String.valueOf(s.charAt(0))+"*"+insertPairStar(s.substring(1, s.length()));
        }else{
            return String.valueOf(s.charAt(0))+insertPairStar(s.substring(1, s.length()));
        }
    }
    public static void main(String[] args) {
        System.out.println(insertPairStar("cacc"));
    }
   
}
