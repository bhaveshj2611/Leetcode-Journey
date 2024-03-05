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
    public int maxDepth(TreeNode root) {
        int ans = 0;
        ans = helper(root);
        return ans;
    }

    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftHt = helper(root.left);
        int rightHt = helper(root.right);

        return 1+Math.max(leftHt,rightHt);
    }
}