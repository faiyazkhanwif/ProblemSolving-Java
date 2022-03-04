/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava.thirtydaysofcode;

import java.util.*;
import java.io.*;

class Node {

    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class D23 {

    static void levelOrder(Node root) {
        Queue<Node> myq = new LinkedList<>();
        myq.add(root);
        while (!myq.isEmpty()) {
            Node curr = myq.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) {
                myq.add(curr.left);
            }
            if (curr.right != null) {
                myq.add(curr.right);
            }
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
