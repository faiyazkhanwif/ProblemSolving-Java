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
public class NextPerfectSquare {

    public static long findNextSquare(long sq) {
        double a = Math.sqrt(sq);
        if (a % 1 != 0) {
            return -1;
        }
        boolean sw = true;
        long val = sq;
        while (sw == true) {
            val += 1;
            double res = Math.sqrt(val);
            if (res % 1 == 0) {
                return val;
            }
        }
        return 0;
    }
}
