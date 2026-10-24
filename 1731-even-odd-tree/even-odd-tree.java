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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int level =0;
        q.add(root);
        while(!q.isEmpty())
        {
            int n =q.size();
            ArrayList<Integer> al = new ArrayList<>();
            for(int i =0 ;i<n ;i++)
            {
                
                TreeNode c = q.peek();
                if(c.left!=null) q.add(c.left);
                if(c.right!=null) q.add(c.right);
                if((level%2==0 && c.val%2!=0)||(level%2!=0 && c.val%2==0))
                {
                al.add(c.val);
                }
                else
                {
                    return false;
                }
                q.remove();
            }
            for(int i=0;i<al.size()-1;i++)
            {
                if(level%2==0 && al.get(i)>=al.get(i+1))
                {
                    return false;
                }
                else if(level%2!=0 && al.get(i)<=al.get(i+1))
                {
                   return false;
                }
            }
            level++;
        }
        return true;
    }
}