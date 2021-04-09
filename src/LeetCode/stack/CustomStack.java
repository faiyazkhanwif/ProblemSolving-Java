/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.stack;

/**
 *
 * @author faiya
 */
public class CustomStack {

    Integer[] st;
    int size;
    int index;

    public CustomStack(int maxSize) {
        size = maxSize;
        st = new Integer[size];
        index = -1;
    }

    public void push(int x) {
        if (index < size-1) {
            index++;
            st[index] = x;
        }
    }

    public int pop() {
        if (index<=-1) {
            return -1;
        }
        int temp = st[index];
        //st[index - 1] = null;
        index--;
        return temp;
    }

    public void increment(int k, int val) {
        if (k-1>index) {
            k=index;
        }else{
            k=k-1;
        }
        for (int i = 0; i <= k; i++) {
            st[i] = st[i] + val;
        }
    }
}
