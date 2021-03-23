/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author faiya
 */
public class BinaryTreePaths {

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

    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> arr = new ArrayList<>();
        if (root == null) {
            return arr;
        }
        dfs(root, "", arr);
        return arr;
    }

    public void dfs(TreeNode root, String str, List<String> ls) {
        str += root.val;
        if (root.left == null && root.right == null) {
            ls.add(str);
            return;
        }
        if (root.left != null) {
            dfs(root.left, str + "->", ls);
        }
        if (root.right != null) {
            dfs(root.right, str + "->", ls);
        }
    }
}
