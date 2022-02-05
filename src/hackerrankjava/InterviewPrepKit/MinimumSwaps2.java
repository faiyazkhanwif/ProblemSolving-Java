/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava.InterviewPrepKit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class MinimumSwaps2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swapcount = 0;
        int i = 0;
        while (i < arr.length) {
            int item = arr[i];
            if (i == arr[i] - 1) {
                i++;
                continue;
            } else {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = item;
                arr[i] = temp;
                swapcount++;
            }
        }
        return swapcount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);
        System.out.println(res);
        //bufferedWriter.write(String.valueOf(res));
        //bufferedWriter.newLine();

        //bufferedWriter.close();
        scanner.close();
    }
}
