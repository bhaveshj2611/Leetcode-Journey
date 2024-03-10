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
    public int countNodes(TreeNode root) {
        // int cnt = 0;
       return helper(root);
        // return cnt;
    }

     public int helper(TreeNode root){
        if(root == null){
            return 0;
        }

        int lhs = getLeftHeight(root);
        int rhs = getRightHeight(root);

        if(lhs == rhs){
            return (1<<lhs)-1;
        }
        return 1 + helper(root.left) + helper(root.right);
    }

    public int getLeftHeight(TreeNode node){
        int h = 0;
        while(node!=null){
            node = node.left;
            h++;
        }
        return h;
    }

      public int getRightHeight(TreeNode node){
        int h = 0;
        while(node!=null){
            node = node.right;
            h++;
        }
        return h;
    }
}