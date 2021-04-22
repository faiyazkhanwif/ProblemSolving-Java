/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicdsimplementations;

/**
 *
 * @author faiya
 */
public class LinkedListIMP {

    static class Node {

        int data;
        Node next;
    }

    static class mylinkedlist {

        Node head;

        public void insert(int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;
            if (head == null) {
                head = node;
            } else {
                Node curr = head;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next = node;
            }
        }

        public void show() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println("");
        }

        public void insertfirst(int data) {
            Node node = new Node();
            node.data = data;
            node.next = head;
            head = node;
        }

        public void insertAt(int data, int index) {
            Node node = new Node();
            node.data = data;
            node.next = null;
            Node curr = head;
            if (index == 0) {
                insertfirst(data);
                return;
            }
            for (int i = 0; i < index-1; i++) {
                curr = curr.next;
            }
            node.next = curr.next;
            curr.next = node;
            
        }
    }

    public static void main(String[] args) {
        mylinkedlist ml = new mylinkedlist();
        ml.insert(5);
        ml.insert(8);
        ml.insert(9);
        ml.insert(4);
        ml.insert(1);
        
        ml.insertfirst(91);
        ml.insertfirst(41);
        
        ml.insertAt(65, 3);
        ml.insertAt(15, 6);
        ml.insertAt(999, 0);

        ml.show();
    }
}
