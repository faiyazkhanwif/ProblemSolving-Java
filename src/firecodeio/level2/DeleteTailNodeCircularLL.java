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
public class DeleteTailNodeCircularLL {

    class ListNode {

        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public ListNode deleteAtTail(ListNode head) {
        ListNode tail = head;
        while(tail.next.next!=head){
            tail = tail.next;
        }
        tail.next = head;
        return head;
        
    }
}
