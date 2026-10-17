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
     boolean f = true;
    void sym(TreeNode p , TreeNode q)
    {
        if(p==null && q==null) return ;
        if(p==null && q!=null || p!=null && q==null)
        {
            f=false;
            return;
        }
        if(p.val == q.val && f==true)
        {
            sym(p.left, q.right);
            sym(p.right , q.left);
        }
        else 
        {
            f=false;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        TreeNode p = root.left;
        TreeNode q = root.right;
        if(p==null && q==null)
        {
            return true;
        }
        sym(p,q);
        return f;
    }
}