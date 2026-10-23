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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> al = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)return al;
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            Double sum =0.0;
            for(int i =0;i<n ;i++)
            {
                TreeNode cur = q.peek();
                if(cur.left!=null)
                {
                    q.add(cur.left);
                }
                if(cur.right!=null)
                {
                    q.add(cur.right);
                }
                q.remove();
                sum=sum+cur.val;
            }
            Double av =sum/n;
            al.add(av);
        }
        return al;
    }
}