/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level2;

import java.util.Stack;

/**
 *
 * @author faiya
 */
public class FindNodeBinaryTreeIterative {

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

    public TreeNode findNode(TreeNode root, int val) {
        if (root==null) {
            return null;
        }
        Stack st = new Stack();
        st.add(root);
        while (root.data != val || !st.empty()) {
            TreeNode temp = (TreeNode) st.pop();
            if (temp.data == val) {
                return temp;
            }
            if (root.right != null) {
                st.add(root.right);
            }
            if (root.left != null) {
                st.add(root.left);
            }
        }
        return null;
    }
}
