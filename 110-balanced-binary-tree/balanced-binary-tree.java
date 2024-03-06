/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }

        boolean leftBT = isBalanced(root.left);
        boolean rightBT = isBalanced(root.right);

        return leftBT && rightBT;
        // return true;
    }

    public int height(TreeNode root){
        if(root == null){
            return 0;

        }

        int lht = height(root.left);
        int rht = height(root.right);

        return 1 + Math.max(lht,rht);
    }
}