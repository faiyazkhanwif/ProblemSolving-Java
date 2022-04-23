/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava.thirtydaysofcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/**
 *
 * @author faiya
 */
public class D29 {

    public static int bitwiseAnd(int N, int K) {
        int maxRes = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int bitwiseres = i & j;
                if (maxRes < bitwiseres && bitwiseres < K) {
                    maxRes = bitwiseres;
                }
            }
            if (maxRes == K - 1) {
                break;
            }
        }
        return maxRes;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = bitwiseAnd(count, lim);

                bufferedWriter.write(String.valueOf(res));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();

    }

}
