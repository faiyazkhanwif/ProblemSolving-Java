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
//Interview Question from Oracle
public class MaxElementBinaryTree {

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
    
    int maxval = Integer.MIN_VALUE;
    public int findMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.data>maxval) {
            maxval = root.data;
        }
        if (root.left!=null) {
            findMax(root.left);
        }
        if (root.right!=null) {
            findMax(root.right);
        }
        return maxval;
    }
}
