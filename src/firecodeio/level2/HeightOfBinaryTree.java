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
public class HeightOfBinaryTree {

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

    public int findHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftheight = findHeight(root.left);
        int rightheight = findHeight(root.right);
        if (leftheight > rightheight) {
            return 1 + leftheight;
        } else {
            return 1 + rightheight;
        }
    }
}
