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
public class NAryPostOrder {

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
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root == null)
            return list;
        
        for(Node node: root.children)
            postorder(node);
        
        list.add(root.val);
        
        return list;
    }
    */
    public List<Integer> postorder(Node root) {
        Stack<Node> st = new Stack<>();
        List<Integer> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        st.push(root);
        while (!st.empty()) {
            Node n = st.pop();
            ans.add(n.val);
            for (Node np : n.children) {
                st.push(np);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
