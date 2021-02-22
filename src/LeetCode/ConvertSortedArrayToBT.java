/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author faiya
 */
public class ConvertSortedArrayToBT {

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
        int left = 0;
        int right = nums.length - 1;
        return work(nums, left, right);

    }

    public TreeNode work(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        TreeNode node = new TreeNode();
        int mid = left + (right - left) / 2; //Avoiding integer overflow;
        node.val = nums[mid];
        node.left = work(nums, left, mid - 1);
        node.right = work(nums, mid + 1, right);
        return node;
    }
}
