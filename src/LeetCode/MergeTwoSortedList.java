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
public class MergeTwoSortedList {

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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null && l2==null) {
            return null;
        }
        if (l1==null){
            return l2;
        }
        if (l2==null) {
            return l1;
        }
        ListNode ln;
        if (l1.val<=l2.val) {
            ln=l1;
            ln.next = mergeTwoLists(l1.next,l2);
        }else{
            ln = l2;
            ln.next = mergeTwoLists(l1,  l2.next);
        }
        return ln;
        
    }
}
