/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author faiya
 */
public class BTInorder {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //Recursive
    List<Integer> nl = new ArrayList<>();

    public List<Integer> inorderTraversalRec(TreeNode root) {
        if (root == null) {
            return nl;
        }
        if (root.left != null) {
            inorderTraversalRec(root.left);
        }
        nl.add(root.val);
        if (root.right != null) {
            inorderTraversalRec(root.right);
        }
        return nl;
    }

    //Iterative
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nl = new ArrayList<>();
        if (root==null) {
            return nl;
        }
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(curr!=null || !st.empty()){
            while(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            nl.add(curr.val);
            curr = curr.right;
        }
        return nl;
    }
}
