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
    public int maxLevelSum(TreeNode root) {
        int  m_sum = Integer.MIN_VALUE;
        int m= 0;
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return 0;
        q.add(root);
        int count=0;
        while(!q.isEmpty())
        {
            int n = q.size();
            int sum=0;
            count++;
            for(int i =0;i<n;i++)
            {
                TreeNode cur= q.peek();
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
            if(sum>m_sum)
            {
                m_sum=sum;
                m=count;
            }
        }
        return m;
    }
}