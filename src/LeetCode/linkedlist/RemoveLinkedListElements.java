/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.linkedlist;

/**
 *
 * @author faiya
 */
public class RemoveLinkedListElements {

    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr!=null){
            if (curr.val==val) {
                prev.next = curr.next;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}
