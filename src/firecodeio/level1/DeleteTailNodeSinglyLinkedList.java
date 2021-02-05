/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level1;

/**
 *
 * @author faiya
 */
public class DeleteTailNodeSinglyLinkedList {

    class ListNode {

        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public ListNode deleteAtTail(ListNode head) {
        if (head==null || head.next==null) {
            return null;
        }
        ListNode prev = head;
        ListNode current = head;
        while (current.next!=null){
            prev = current;
            current = current.next;
        }
        current = null;
        prev.next = current;
        return head;
    }
}
