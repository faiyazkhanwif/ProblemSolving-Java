/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.dsI;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author faiya
 */
public class LC141 {

    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hm = new HashSet<>();
        while (head != null) {
            if (!hm.contains(head)) {
                hm.add(head);
            } else {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
