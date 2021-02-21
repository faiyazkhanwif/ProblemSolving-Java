/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author faiya
 */
public class NAryPreOrder {

    class Node {

        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    /*Recursive
    List<Integer> ans = new LinkedList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return ans;
        }
        Node n = root;
        ans.add(n.val);
        for (Node ch : n.children) {
            preorder(ch);
        }
        return ans;
    }
    */
    
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Stack<Node> st = new Stack();
        st.push(root);
        while(!st.empty()){
            Node n = st.pop();
            ans.add(n.val);
            Collections.reverse(n.children);
            for (Node temp: n.children) {
                st.push(temp);
            }
        }
        return ans;
    }
}
