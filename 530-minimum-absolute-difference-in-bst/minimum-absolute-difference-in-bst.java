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
    int min = Integer.MAX_VALUE;
    TreeNode pre = null;
    void fun(TreeNode root )
    {
        if(root == null) return ;
        fun(root.left);
        if(pre != null)
        {
            min=Math.min(root.val-pre.val ,min);
        }
        pre=root;
        fun(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        fun(root);
        return min;
    }
}