/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level1;

/**
 *
 * @author faiya
 */
//Oracle
public class NumberAppearOnce {

    public static int singleNumber(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int x = A[i];
            int count = 1;
            for (int j = 0; j < A.length; j++) {
                int y = A[j];
                if (x==y && i!=j) {
                    count++;
                }
            }
            if (count == 1) {
                return x;
            }
            count=1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] A = {1,1,1,4,5,6,7,7,6,4};
        System.out.println(singleNumber(A));
    }
}
