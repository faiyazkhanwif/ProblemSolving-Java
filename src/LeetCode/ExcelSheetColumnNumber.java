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
public class ExcelSheetColumnNumber {

    static int titleToNumber(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans = ans*26+(s.charAt(i)-'A'+1);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
}
