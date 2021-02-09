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
//Interview Question from Blizzard
public class PowerOfTwo {

    public static boolean isPowOfTwo(int num) {
        if (num==1) {
            return true;
        }
        double temp = Math.pow(num, 1/2);
        //System.out.println(temp);
        if (temp%1 == 0 && num%2 == 0) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPowOfTwo(1));
    }
}
