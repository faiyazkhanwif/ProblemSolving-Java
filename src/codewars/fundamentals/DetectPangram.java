/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars.fundamentals;

/**
 *
 * @author faiya
 */
public class DetectPangram {

    public boolean check(String sentence) {
        sentence = sentence.toLowerCase();
        String[] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        boolean x = true;
        for (int i = 0; i < arr.length; i++) {
            if (sentence.contains(arr[i])==false) {
                x = false;
                break;
            }
        }
        return x;
    }
}
