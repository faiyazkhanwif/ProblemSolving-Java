/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.util.HashSet;

/**
 *
 * @author faiya
 */
class ListNode {

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

public class LC083 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        HashSet<Integer> hs = new HashSet<>();
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            if (hs.contains(curr.val)) {
                prev.next = curr.next;
            } else {
                hs.add(curr.val);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}
