/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
class Container {

    String name;
    int capacity;
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        MyStack<Container> stack2 = new MyStack<>(n);
        MyStack<Container> stack3 = new MyStack<>(n);
        String[] names = new String[n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            Container c = new Container();
            int x = i + 1;
            System.out.print("Enter name for container " + x + " :");
            c.name = in.next();
            System.out.print("Enter capacity for container " + x + " :");
            c.capacity = in.nextInt();
            int flag = 0;
            Container c1;
            if (Arrays.asList(names).indexOf(c.name) == -1) {
                stack2.push(c);
                names[num] = c.name;
                num++;

            } else {
                while (flag == 0) {
                    c1 = stack2.peek();
                    if (c.name.equals(c1.name)) {
                        stack2.push(c);
                        flag = 1;
                    } else {
                        stack2.pop();
                        stack3.push(c1);
                    }
                }
                while (stack3.peek() != null) {
                    stack2.push(stack3.pop());
                }
            }
        }
        for (int i = 0; i < n; i++) {
            Container c1 = stack2.pop();
            System.out.println(c1.name);
            stack3.push(c1);
        }
        for (int i = 0; i < n; i++) {
           Container c2 = stack3.pop();
            stack2.push(c2);
        }
    }

}
