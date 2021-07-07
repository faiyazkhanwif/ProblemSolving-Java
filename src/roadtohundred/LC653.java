/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

import java.util.HashSet;

/**
 *
 * @author faiya
 */
public class LC653 {

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

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        HashSet<Integer> hs = new HashSet<>();
        return mymethod(root, hs, k);
    }

    public boolean mymethod(TreeNode node, HashSet hs, int k) {
        if (node == null) {
            return false;
        }
        if (hs.contains(k - node.val)) {
            return true;
        }
        hs.add(node.val);
        return mymethod(node.left, hs, k) || mymethod(node.right, hs, k);
    }
}
