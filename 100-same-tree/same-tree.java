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
    void iden(TreeNode r1 , TreeNode r2 )
    {
        if(r1==null&& r2==null)
        {
            return;
        }
        if((r1==null && r2!=null) || (r1!=null && r2==null))
        {
            f=false;
            return;
        }
        if(r1.val==r2.val && f==true)
        {
            f=true;
            iden(r1.left,r2.left);
            iden(r1.right,r2.right);
        }
        else
        {
            f=false;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
        {
            return true;
        }
        iden(p,q);
        return f;
    }
}