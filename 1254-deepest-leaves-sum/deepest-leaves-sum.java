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
    class MyPair{
        TreeNode root;
        int level;
    }
    public int deepestLeavesSum(TreeNode root) {
        int level = 0;
        int sum = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int maxL = 0;
        while(!q.isEmpty()){
            sum=0;
            int size = q.size();
            maxL = Math.max(level,maxL);
            for(int i=0;i<size;i++){
                
                 TreeNode node = q.remove();
                if(node.left !=null){
                    q.add(node.left);
                    level++;
                }
                else{
                    // sum = sum + node.val;
                }
                if(node.right!=null){
                    q.add(node.right);
                    level++;
                }
                else{
                    sum = sum + node.val;
                }
            }
        }

        return sum;
    }
}