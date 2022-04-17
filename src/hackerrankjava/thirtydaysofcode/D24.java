/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava.thirtydaysofcode;

import java.io.*;
import java.util.*;

/**
 *
 * @author faiya
 */
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

}

public class D24 {

    public static Node removeDuplicates(Node head) {
        HashSet<Integer> hs = new HashSet<>();
        if (head == null || head.next == null) {
            return head;
        } else {
            Node prev = head;
            Node curr = head.next;
            hs.add(prev.data);

            while (curr != null) {
                if (!hs.contains(curr.data)) {
                    hs.add(curr.data);
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr = curr.next;
                }
            }

            return head;
        }

    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null) {
            head = p;
        } else if (head.next == null) {
            head.next = p;
        } else {
            Node start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = p;

        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}
