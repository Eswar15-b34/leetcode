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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> al = new  ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return 0;
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            long sum =0;
            for(int i=0;i<n ;i++)
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
                sum=sum+cur.val;
                q.remove();
            }
            al.add(sum);
        }
       Collections.sort(al);
        if(al.size()-k>=0)
        {
        return al.get(al.size()-k);
        }
        return -1;
    }
}