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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1 )
        {
            TreeNode t = new TreeNode(val);
            t.left = root;
            return t;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level =1;
        while(level!=depth)
        {
           int n = q.size();
           for(int i=0;i<n;i++)
           {
             TreeNode cur = q.peek();
             if( cur.left!=null )
             {
                if(level==depth-1)
                {
                TreeNode t = new TreeNode(val);
                t.left=cur.left;
                cur.left=t;
                }
                else
                {
                  q.add(cur.left);
                }
             }
             else if(level == depth-1 && cur.left==null)
             {
                TreeNode t = new TreeNode(val);
                cur.left=t;
                t.left=null;
             }
             if(cur.right !=null)
             {
                if(level==depth-1)
                {
                TreeNode ti = new TreeNode(val);
                ti.right=cur.right;
                cur.right = ti;
                }
                else
                {
                    q.add(cur.right);
                }
             }
             else if(level == depth-1 && cur.right==null)
             {
                TreeNode ti = new TreeNode(val);
                cur.right=ti;
                ti.right=null;
             }
             q.remove();
           }
           level++;
        }
         return root;
    }
}