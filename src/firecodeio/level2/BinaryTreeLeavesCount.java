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
//Interview question from facebook
public class BinaryTreeLeavesCount {

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
    
    
    /* Recursive way of finding number Of Nodes.
    int count = 0;
    public int numberOfNodes(TreeNode root) {
        if (root==null) {
            return 0;
        }
        count++;
        numberOfNodes(root.left);
        numberOfNodes(root.right);
        return count;
        
    }
     */
    
    int count = 0;
    public int numberOfLeaves(TreeNode root) {
        if (root==null) {
            return 0;
        }
        if (root.left==null && root.right==null) {
            count++;
        }
        numberOfLeaves(root.left);
        numberOfLeaves(root.right);
        return count;
        
    }
}
