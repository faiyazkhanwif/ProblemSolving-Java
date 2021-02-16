/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level3;

/**
 *
 * @author faiya
 */
//Interview Question from Google
public class DiameterOfaBST {

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

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        if (leftheight >= rightheight) {
            return 1 + leftheight;
        } else {
            return 1 + rightheight;
        }

    }

    public int diameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        // if diameter does not go through root
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        int goesthroughroot =  1 + leftheight + rightheight;
        int doesnotgothroughroot =  Math.max(ldiameter, rdiameter);
        
        return Math.max(goesthroughroot, doesnotgothroughroot);
    }
}
