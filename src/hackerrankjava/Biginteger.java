/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class Biginteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger x = in.nextBigInteger();
        BigInteger y = in.nextBigInteger();
        BigInteger ans = null;
        ans = x.add(y);
        System.out.println(ans);
        ans = x.multiply(y);
        System.out.println(ans);
    }
}
