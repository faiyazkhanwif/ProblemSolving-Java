/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level3;

import java.util.Stack;

/**
 *
 * @author faiya
 */
//Oracle
public class MaxElementInABinaryTree {

    class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int data) {
            this.data = data;
        }

        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public int findMaxItr(TreeNode root) {
        if (root == null){
            return 0;
        }
        Stack st = new Stack();
        st.push(root);
        int max = root.data;
        while (!st.empty()){
            TreeNode temp = (TreeNode)st.pop();
            if (temp.data>max) {
                max=temp.data;
            }
            if (temp.left!=null) {
                st.push(temp.left);
            }
            if (temp.right!=null) {
                st.push(temp.right);
            }
        }
        return max;
    }
}
