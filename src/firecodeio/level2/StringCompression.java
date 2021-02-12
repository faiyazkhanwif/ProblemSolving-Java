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
//Interview Question from amazon
public class StringCompression {

    public static String compressString(String text) {
        char temp = '0';
        String res = "";
        int i = 0;
        while (i < text.length()) {
            //System.out.println("i-----"+i);
            //System.out.println(res);
            int occur = 1;
            temp = text.charAt(i);
            //System.out.println("temp-"+temp);
            if (i==text.length()-1 && text.charAt(i-1)!=text.charAt(i)) {
                res += String.valueOf(temp);
            }
            
            //System.out.println(res);
            int ind = i + 1;
            if (ind >= text.length()) {
                break;
            }
            while (text.charAt(i) == text.charAt(ind)) {
                //System.out.println("ekhane-------------");
                
                occur += 1;
                //System.out.println(occur);
                if (ind>=text.length()-1) {
                    break;
                }
                ind++;
            }
            if (occur > 1) {
                res += String.valueOf(temp);
                res += String.valueOf(occur);
                i = ind;
            } else {
                res += String.valueOf(temp);
                i = ind;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = compressString("aaabbbbbcccc");
        System.out.println(str);
    }
}
