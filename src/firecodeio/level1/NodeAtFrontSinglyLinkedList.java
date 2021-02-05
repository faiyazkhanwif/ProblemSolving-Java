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
public class NodeAtFrontSinglyLinkedList {

    class ListNode {

        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public ListNode insertAtHead(ListNode head, int data) {
        ListNode ln = new ListNode(data);
        ln.next = head;
        return ln;
    }
}
