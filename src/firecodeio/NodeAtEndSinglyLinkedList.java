/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio;

/**
 *
 * @author faiya
 */
public class NodeAtEndSinglyLinkedList {

    class ListNode {

        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public ListNode insertAtTail(ListNode head, int data) {
        ListNode ln = new ListNode(data);
        ListNode current = head;
        if (head==null) {
            head = ln;
            return head;
        }
        while (current.next != null){
            current = current.next;
        }
        current.next = ln;
        ln.next = null;
        return head;
    }
}
