/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

import java.util.HashMap;

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
        if (head == null) {
            return false;
        }
        HashMap<ListNode, Integer> hm = new HashMap<>();
        ListNode curr = head;
        int pos = 0;
        boolean res = false;
        while (curr != null) {
            if (hm.containsKey(curr) == false) {
                hm.put(curr, pos);
            } else {
                res = true;
                break;
            }
            curr = curr.next;
            pos++;
        }
        return res;
    }

    /*Fastest solution
    public boolean hasCycle(ListNode head) {
        //Set the slow and fast pointers
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        
        //Initially, since fast pointer is the same as head, if head, or head.next
        //is null, then there is no cycle, so return false. Otherwise, if the fast
        //node is not pointing to the head of the list, check to see if the current
        //node is null, or it's next node is null (check for both fastPointer and 
		//fastPointer.next to avoid a null pointer exception when updating 
		//fastPointer to fastPointer.next.next) and check if the slow pointer 
		//and the fast pointer are the same, if so, then a cycle exists, so return true. 
        
        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            
            if(slowPointer == fastPointer)return true;
        }
        
        return false;
    }
     */
}
