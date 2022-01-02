/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.dsI;

/**
 *
 * @author faiya
 */
public class LC021 {

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
// Unoptimized
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        int count = 0;
        ListNode res = null;
        ListNode myhead = null;
        
        while(curr1!=null || curr2!=null){
            if (curr2==null && curr1!=null){
                    if(count == 0){
                        res = curr1;
                        myhead = res;
                        count++;
                    }else{
                        res.next = curr1;
                        res = res.next;
                    }
                    curr1 = curr1.next;
            }else if (curr1==null && curr2!=null){
                    if(count == 0){
                        res = curr2;
                        myhead = res;
                        count++;
                    }else{
                        res.next = curr2;
                        res = res.next;
                    }
                    curr2 = curr2.next;
            }else{
                if (curr1.val <= curr2.val){ 
                    if(count == 0){
                        res = curr1;
                        myhead = res;
                        count++;
                    }else{
                        res.next = curr1;
                        res = res.next;
                    }
                    curr1 = curr1.next;
                }else if (curr2.val < curr1.val){
                    if(count == 0){
                        res = curr2;
                        myhead = res;
                        count++;
                    }else{
                        res.next = curr2;
                        res = res.next;
                    }
                    curr2 = curr2.next;
                }
            }

        }
        return myhead;
    }
}
