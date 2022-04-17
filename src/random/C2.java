/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

/**
 *
 * @author faiya
 */
public class C2 {

    public static int[] solution(int[] A) {
        int[] res = new int[100];
        double num = 0;
        for (int i = 0; i < A.length; i++) {
            double temp = Math.pow(-2, i);
            num += (A[i] * temp);
        }
        int ansnum = (int) Math.ceil(num / 2);
        
        int quot;
        int i = 1;
        quot = ansnum;
        while (quot != 0) {
            res[i++] = quot % (-2);
            quot = quot / (-2);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {1, 0, 0, 1, 1};
        System.out.println(solution(A));
    }
}
