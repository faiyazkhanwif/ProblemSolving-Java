/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

/**
 *
 * @author faiya
 */
public class LC108 {

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

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return constructTree(nums,0,nums.length-1);

    }

    public TreeNode constructTree(int[] nums, int left, int right) {
        if (left>right) {
            return null;
        }
        int midpoint = left+(right-left)/2;
        TreeNode tn = new TreeNode();
        tn.val = nums[midpoint];
        tn.left = constructTree(nums,left,midpoint-1);
        tn.right = constructTree(nums,midpoint+1,right);
        return tn;
        
    }
}
