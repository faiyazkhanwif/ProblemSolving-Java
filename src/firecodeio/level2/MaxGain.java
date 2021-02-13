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
//Interview Question from BloomBerg
public class MaxGain {

    public static int maxGain(int[] a) {
        int min = a[0];
        int minind = 0;
        int maxind = 0;
        int max = a[0];
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]<min && i<minind) {
                min = a[i];
                minind = i;
            }
            if (a[i]>max && i>minind) {
                max = a[i];
            }
        }
        //System.out.println("Min: "+min);
        //System.out.println("Max: "+max);
        return max-min;
    }
    public static void main(String[] args) {
        int[] arr = {100,40,20,10};
        System.out.println(maxGain(arr));
    }
}
