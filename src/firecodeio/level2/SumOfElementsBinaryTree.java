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
/*

Example:  
       1
      / \
     2   3    
    / \ / \        
   4  5 6  7
  /
 8   
  ==> sum of all nodes = 36 
  (1+2+3+4+5+6+7+8)
*/
public class SumOfElementsBinaryTree {

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

    public int sum(TreeNode root) { //lnr InOrder Traversal
        if (root == null) {
            return 0;
        }
        return sum(root.left)+root.data+sum(root.right);
    }
}
