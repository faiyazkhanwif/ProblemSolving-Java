/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level2;

/**
 *
 * @author faiya
 */
//Interview question from Oracle
public class EvenOrOdd {

    class ListNode {

        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public Boolean isListEven(ListNode head) {
        if (head == null) {
            return true;
        }
        int size = 1;
        while (head.next!=null){
            head = head.next;
            size++;
        }
        if (size%2==0) {
            return true;
        }else{
            return false;
        }
    }
}
