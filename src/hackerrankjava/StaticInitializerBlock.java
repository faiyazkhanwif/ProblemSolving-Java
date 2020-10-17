package hackerrankjava;

import java.util.*;

public class StaticInitializerBlock {

    static Scanner in = new Scanner(System.in);
    static boolean flag = false;
    static int B = in.nextInt();
    static int H = in.nextInt();

    static {
        try {
            if (B > 0 && H > 0) {
                flag = true;
            } else {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

