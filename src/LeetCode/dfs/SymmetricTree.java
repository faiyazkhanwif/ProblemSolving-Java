/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.dfs;

/**
 *
 * @author faiya
 */
public class SymmetricTree {

    class TreeNode {

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

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return check(root.left, root.right);
    }

    public boolean check(TreeNode leftsub, TreeNode rightsub) {
        if (leftsub == null && rightsub == null) {
            return true;
        }
        if (leftsub == null || rightsub == null) {
            return false;
        }
        if (leftsub.val == rightsub.val) {
            return check(leftsub.left, rightsub.right) && check(leftsub.right, rightsub.left);

        }
        return false;
    }
}
