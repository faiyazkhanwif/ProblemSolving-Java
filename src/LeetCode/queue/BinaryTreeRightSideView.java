/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author faiya
 */
public class BinaryTreeRightSideView {

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
    

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(que.size()!=0){
            int size = que.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = que.poll();
                if (i==size-1) {
                    ans.add(curr.val);
                }
                if (curr.right!=null) {
                    que.add(curr.right);
                }
                if (curr.left!=null) {
                    que.add(curr.left);
                }
            }
        }
        return ans;
    }
}
