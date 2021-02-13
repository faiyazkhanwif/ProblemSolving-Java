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
//Interview Question from Microsoft
public class PowByMS {

    public static double pow(double x, int n) {
        double powval = x;
        if (n == 0) {
            return 1;
        } else if (n > 0) {

            for (int i = 0; i < n - 1; i++) {
                x = x * powval;
            }
        } else {
            int temp = n*(-1);
            for (int i = 0; i < temp - 1; i++) {
                x = x * powval;
            }
            x = 1/x;
        }
        return x;
    }

    public static void main(String[] args) {
        double ans = pow(2, -3);
        System.out.println(ans);
    }
}
