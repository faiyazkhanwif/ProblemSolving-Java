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
public class SelectionSort {

    public static int[] selectionSortArray(int[] arr) {
        int ind = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int smval = arr[i];
            int smind = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < smval) {
                    smval = arr[j];
                    smind = j;
                }
            }
            int temp = arr[i];
            arr[i] = smval;
            arr[smind] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2};
        int[] res = selectionSortArray(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            System.out.print(" ");
        }
    }
}
