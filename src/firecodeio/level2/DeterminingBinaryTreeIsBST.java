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
public class DeterminingBinaryTreeIsBST {

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

    public static boolean validateBST(TreeNode root) {
        return validateBST(root, null, null);
    }

    private static boolean validateBST(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data < min || max != null && root.data > max) {
            return false;
        }
        return validateBST(root.left, min, root.data) && validateBST(root.right, root.data, max);
    }

}
