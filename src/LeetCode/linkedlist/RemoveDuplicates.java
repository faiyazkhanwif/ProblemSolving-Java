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
public class RemoveDuplicates {

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

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr!=null){
            ListNode compwith = curr.next;
            while(compwith!=null){
                if (curr.val==compwith.val) {
                    curr.next = compwith.next;
                }
                compwith = compwith.next;
            }
            curr = curr.next;
        }
        return head;
    }
}
