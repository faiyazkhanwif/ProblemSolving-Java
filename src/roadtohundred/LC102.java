/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class LC102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> mylist = new ArrayList<>();
        if (root == null) {
            return mylist;
        }
        Queue<TreeNode> myq = new LinkedList<>();
        myq.add(root); //9 ,20
        List<Integer> level = new ArrayList<>();
        while (!myq.isEmpty()) {
            int size = myq.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = myq.poll();
                level.add(curr.val);
                if (curr.left != null) {
                    myq.add(curr.left);
                }
                if (curr.right != null) {
                    myq.add(curr.right);
                }
            }
            mylist.add(level);
            level = new ArrayList<>();
        }
        return mylist;
    }
}
