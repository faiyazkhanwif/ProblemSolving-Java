/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author faiya
 */
public class ReverseALinkedList {

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

    //Iterative
    /*
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
     */
    //Recursive
    public ListNode reverseList(ListNode head) {
        return work(head, null);
    }

    public ListNode work(ListNode head, ListNode newHead) {
        if (head == null) {
            return newHead;
        }
        ListNode curr = head;
        ListNode next = curr.next;
        curr.next = newHead;
        newHead = curr;
        curr = next;
        return work(curr, newHead);
    }
}
