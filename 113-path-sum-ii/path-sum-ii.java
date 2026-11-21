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
    List<List<Integer>> al = new ArrayList<>();
    void fun(TreeNode root , int t, List<Integer> l)
    {
        if(root==null) return ;
        l.add(root.val);
        t=t-root.val;
        if(root.left == null && root.right == null && t == 0) 
        {
            al.add(new ArrayList<>(l));
        }
        if(root.left != null)
        {
            fun(root.left, t , l);
        }
        if(root.right != null)
        {
            fun(root.right, t, l);
        }
        l.remove(l.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> l = new ArrayList<>();
        fun(root, targetSum, l);
        return al;
    }
}