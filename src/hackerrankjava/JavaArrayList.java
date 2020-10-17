package hackerrankjava;

import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT
         */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList[] mylist = new ArrayList[n];
        int i = 0;
        while (i < n) {
            int a = in.nextInt();
            mylist[i] = new ArrayList();
            for (int j = 0; j < a; j++) {
                int x = in.nextInt();
                //System.out.println(x);
                mylist[i].add(x);
            }
            System.out.println(mylist[i]);
            i++;

        }

        //System.out.println("-----------------");
        int m = in.nextInt();
        System.out.println(m);
        int o = 1;
        while (o <= m) {
            int j = in.nextInt();
            int k = in.nextInt();
            System.out.println(j + "and" + k);
            try {
                System.out.println(mylist[j - 1].get(k - 1));
            } catch(IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }

            o++;
        }

    }
}
