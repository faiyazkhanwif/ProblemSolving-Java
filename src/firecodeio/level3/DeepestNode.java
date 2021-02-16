/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level3;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author faiya
 */

//Interview Question from Adobe
public class DeepestNode {
    
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
    
    public TreeNode findDeepest(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        Queue qn = new LinkedList();
        qn.add(root);
        TreeNode deepestnode = null;
        while (!qn.isEmpty()) {
            TreeNode temp = (TreeNode) qn.peek();
            qn.poll();
            if (temp.left != null) {
                qn.add(temp.left);
                deepestnode = temp.left;
            }
            if (temp.right != null) {
                qn.add(temp.right);
                deepestnode = temp.right;
            }
        }
        return deepestnode;
    }
}
