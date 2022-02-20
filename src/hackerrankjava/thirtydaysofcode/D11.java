/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava.thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author faiya
 */
public class D11 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int temp = 0;
                //top
                temp += arr.get(i).get(j);
                temp += arr.get(i).get(j + 1);
                temp += arr.get(i).get(j + 2);

                //mid
                temp += arr.get(i + 1).get(j + 1);

                //bottom
                temp += arr.get(i + 2).get(j);
                temp += arr.get(i + 2).get(j + 1);
                temp += arr.get(i + 2).get(j + 2);

                if (temp > max) {
                    max = temp;
                }
            }

        }
        System.out.println(max);

        bufferedReader.close();
    }
}
