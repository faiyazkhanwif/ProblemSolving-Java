/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level3;

/**
 *
 * @author faiya
 */
//TripAdvisor
public class DistanceOfANodeBT {

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

    public int pathLengthFromRoot(TreeNode root, int n1) {
        if (root == null) {
            return 0;
        }
        int distance = 0;
        if (root.data == n1) {
            return distance + 1;
        }
        distance = pathLengthFromRoot(root.left, n1);
        if (distance > 0) {
            return distance + 1;
        }
        distance = pathLengthFromRoot(root.right, n1);
        if (distance>0) {
            return distance+1;
        }
        return distance;
        
    }
}
