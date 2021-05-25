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
public class CheckPangram {

    public boolean checkIfPangram(String sentence) {
        String arr = "abcdefghijklmnopqrstuvwsyz";
        String newsen = sentence.toLowerCase();
        for (int i = 0; i < arr.length(); i++) {
            if (!newsen.contains(String.valueOf(arr.charAt(i)))) {
                return false;
            }
        }
        return true;

    }
}
