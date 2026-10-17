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
    public TreeNode invertTree(TreeNode t) {
        TreeNode root = t;
        if(root==null)
        {
            return root;
        }
        if(root.left==null && root.right==null)
        {
            return root ;
        }
        else if(root.left==null && root.right !=null)
        {
            
            root.left=root.right;
            root.right=null;
            invertTree(root.left);
        }
        else if(root.left!=null && root.right ==null)
        {
            root.right=root.left;
             root.left=null;
            invertTree(root.right);
        }
        else if(root.left!=null && root.right !=null)
        {
        TreeNode temp = root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
        }
        return root;
    }
}