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
public class BinaryNumbertoIntegerUsingLL {

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

    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        String bin = "";
        while (curr != null) {
            bin += String.valueOf(curr.val);
            curr = curr.next;
        }
        int ans = Integer.parseInt(bin,2);
        return ans;

    }
}
