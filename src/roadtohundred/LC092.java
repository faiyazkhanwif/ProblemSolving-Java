/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author faiya
 */
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

public class LC092 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> mylist = new ArrayList<>();
        traverse(mylist, root);
        return mylist;
    }

    public void traverse(List<Integer> mylist, TreeNode root) {
        if(root!=null){
            if (root.left != null) {
                traverse(mylist, root.left);
            }

            mylist.add(root.val);

            if (root.right != null) {
                traverse(mylist, root.right);
            }
        }
    }
}
