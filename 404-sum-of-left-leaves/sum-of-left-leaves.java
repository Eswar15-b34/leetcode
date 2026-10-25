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
    public int sumOfLeftLeaves(TreeNode root) {
       List<Integer> ans = new ArrayList<>();
       int sum =0;
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return 0;
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            List<Integer> al = new ArrayList<>();
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
                
                TreeNode lf=cur.left;
                if(lf!=null){
                    if(lf.left==null && lf.right==null){
                       al.add(lf.val);
                    }
            }q.remove();}
            for(int j=0;j<al.size();j++)
            {
                sum=sum+al.get(j);
            }
        }
        return sum;
    }
}