/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level2;

import java.util.ArrayList;

/**
 *
 * @author faiya
 */
public class RecursivePreOrderTraversalBT {

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
    ArrayList<Integer> preorderedList = new ArrayList<Integer>();

    public void preorder(TreeNode root) {
        if (root != null) {
            preorderedList.add(root.data);
            if (root.left != null) {
                preorder(root.left);
            }
            if (root.right != null) {
                preorder(root.right);
            }
        }
    }
}
