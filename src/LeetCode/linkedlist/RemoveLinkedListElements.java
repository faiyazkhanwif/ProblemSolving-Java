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
        while(head!=null && head.val==val){
            head = head.next;
        }
        ListNode curr = head;
        while(curr.next!=null){
            if (curr.next.val==val && curr.next.next!=null) {
                curr.next = curr.next.next;
            }else if (curr.next.val==val && curr.next.next==null){
                curr.next = null;
            }
        }
        return head;
    }
}
