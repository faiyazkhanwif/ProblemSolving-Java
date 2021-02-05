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
// Interview ques from Microsoft
public class MissingNumber {

    public static int findMissingNumber(int[] arr) {
        int temp[] = {1,2,3,4,5,6,7,8,9};
        int given[] = arr;
        for (int i = 0; i < temp.length; i++) {
            int x = temp[i];
            for (int j = 0; j < arr.length; j++) {
                if (x==arr[j]) {
                    break;
                }
                if (j==arr.length-1) {
                    return x;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int test[] = {4,5,6,7,8,10,1,2,3};
        System.out.println(findMissingNumber(test));
    }
}
