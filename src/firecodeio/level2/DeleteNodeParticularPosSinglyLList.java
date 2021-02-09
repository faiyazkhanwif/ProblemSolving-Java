/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level2;

/**
 *
 * @author faiya
 */
//Interview Question from Oracle
public class DeleteNodeParticularPosSinglyLList {

    class ListNode {

        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public ListNode deleteAtMiddle(ListNode head, int position) {
        ListNode sizechecker = head;
        int size = 0;
        while(sizechecker!=null){
            size++;
            sizechecker = sizechecker.next;
        }
        if (size+1<position) {
            return head;
        }
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            head = null;
            return head;
        }
        if (position == 1) {
            head = head.next;
            return head;
        }
        ListNode ln = head;
        ListNode ln1 = head;
        for (int i = 0; i < position-2; i++) {
            ln = ln.next;
        }
        for (int i = 0; i < position; i++) {
            ln1 = ln1.next;
        }
        ln.next = ln1;
        return head;
    }
}
