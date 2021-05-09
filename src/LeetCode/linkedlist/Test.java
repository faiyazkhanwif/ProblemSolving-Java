/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.linkedlist;

/**
 *
 * @author faiya
 */
public class Test {

    public static void main(String[] args) {
        Calculate cl = new Calculate();
        char result = cl.X(4, 7);
        System.out.println(result);
    }

}

class Calculate {

    public char X(double A, double B) {
        double answer = A + B;
        char result = Y(answer);
        return result;
    }

    public char Y(double answer) {
        return 'Y';
    }
}
