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
public class RevIntWithoutAdditionalHeapSpace {

    public static int reverseInt(int x) {
        int val = x;
        int rev = 0;
        int tobeused = 0;
        while(val!=0){
            tobeused = val%10;
            rev = rev*10+tobeused;
            val = val/10;
            System.out.println("hi");
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverseInt(123));
    }
}
