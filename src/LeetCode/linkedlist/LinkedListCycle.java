/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.linkedlist;

import java.util.HashMap;

/**
 *
 * @author faiya
 */
public class LinkedListCycle {

    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        HashMap<Integer, ListNode> hm = new HashMap<>();
        ListNode curr = head;
        boolean res = false;
        int i = 0;
        while (curr != null) {
            if (hm.containsValue(curr)) {
                res = true;
                return res;
            }
            hm.put(i, curr);
            curr = curr.next;
            i++;
        }
        return res;

    }
    
    /*Efficient Solution
    public boolean hasCycle(ListNode head) {
    if(head==null) return false;
    ListNode walker = head;
    ListNode runner = head;
    while(runner.next!=null && runner.next.next!=null) {
        walker = walker.next;
        runner = runner.next.next;
        if(walker==runner) return true;
    }
    return false;
}
    */
}
