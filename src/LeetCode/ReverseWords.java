/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author faiya
 */
public class ReverseWords {

    static String reverseWords(String s) {
        String temp = "";
        String word = "";
        int wordcount = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                word += String.valueOf(s.charAt(i));
                //System.out.println(word);
            }
            if (s.charAt(i) == ' ' || i == 0) {
                if (wordcount == 0) {
                    temp += word;
                    wordcount++;
                } else {
                    temp = word + " " + temp;
                }
                word = "";
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
