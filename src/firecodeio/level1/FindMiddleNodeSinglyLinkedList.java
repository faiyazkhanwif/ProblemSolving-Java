/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level1;

/**
 *
 * @author faiya
 */
public class FindMiddleNodeSinglyLinkedList {

    class ListNode {

        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public ListNode findMiddleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode toc = head;
        ListNode midn = head;
        int lencount = 1;
        while (toc.next != null) {
            toc = toc.next;
            lencount++;
        }
        int chck = lencount / 2;
        int chck2 = lencount % 2;
        if (chck2 > 0) {
            for (int i = 0; i < chck ; i++) {
                midn = midn.next;
            }
        } else {
            for (int i = 0; i < chck-1; i++) {
                midn = midn.next;
            }
        }
        return midn;
    }
}
