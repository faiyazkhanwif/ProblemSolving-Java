/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level2;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author faiya
 */
public class IterativePreOrderTraversal {

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

    public ArrayList<Integer> preorderItr(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack st = new Stack();
        st.add(root);
        while (st.empty() != true) {
            TreeNode node = (TreeNode)st.pop();
            res.add(node.data);
            
            if (node.right!=null) {
                st.add(node.right);
            }
            
            if (node.left!=null) {
                st.add(node.left);
            }
        }
        return res;
    }
}
