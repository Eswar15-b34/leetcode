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
   int max=0;
    int fun(TreeNode root)
    {
         if(root==null ) return 0;
         int l = fun(root.left);
         int r = fun(root.right);
         max = Math.max(max,l+r);
        return  1+Math.max(l,r);
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
       fun(root);
       return max;
       
    }
}