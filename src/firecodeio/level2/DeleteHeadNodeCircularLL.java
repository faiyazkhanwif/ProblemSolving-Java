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
public class DeleteHeadNodeCircularLL {

    class ListNode {

        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public ListNode deleteAtHead(ListNode head) {
        if (head==null || head.next==null || head.next==head) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        ListNode curr = head;
        while (curr.next!=temp){
            curr = curr.next;
        }
        curr.next = head;
        return head;
    }
}
