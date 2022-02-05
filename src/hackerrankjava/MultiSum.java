/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class MultiSum {

public static Integer sum(Integer[] ints) {
        Integer sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum;
    }

    public static String sum(String[] words) {
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i];
        }
        return res;
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String args[]) throws Exception {

        Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Integer[] arr = new Integer[arrItems.length];
        String[] arr1 = new String[arrItems.length];
        String numbers = "Yes";
        for (int i = 0; i < arrItems.length; i++) {

            if (isNumeric(arrItems[i])) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            } else {
                arr1[i] = arrItems[i];
                numbers = "No";
            }
        }
        
        int res = 0;
        String res1 = "";
        if(numbers == "Yes"){
            res = sum(arr);
            System.out.println(res);
        }else{
            res1 = sum(arr1);
            System.out.println(res1);
        }
        // bufferedWriter.write(String.valueOf(res));
        // bufferedWriter.newLine();

        // bufferedWriter.close();
        scanner.close();
    }
}
