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
public class Test {

    public static void main(String[] args) {
        int len = 4;
        int count = (len / 2)+1;
        int block = 1;
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                if (count == j) {
                    if (i == 1) {
                        System.out.print("*");
                    }else{
                        for (int k = 1; k <= block; k++) {
                            //System.out.print(k);
                            System.out.print("*");
                        }
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            count = count - 1;
            block = block+2;
        }
    }
}
