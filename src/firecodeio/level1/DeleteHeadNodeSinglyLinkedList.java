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
public class DeleteHeadNodeSinglyLinkedList {

    class ListNode {

        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public ListNode deleteAtHead(ListNode head) {
        if(head == null){
            return null;
        }
        head = head.next;
        return head;
    }
}
