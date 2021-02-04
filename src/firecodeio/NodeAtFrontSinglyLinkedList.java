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
class ListNode {

    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }
}

public class NodeAtFrontSinglyLinkedList {

    public ListNode insertAtHead(ListNode head, int data) {
        ListNode ln = new ListNode(data);
        ln.next = head;
        return ln;
    }
}
