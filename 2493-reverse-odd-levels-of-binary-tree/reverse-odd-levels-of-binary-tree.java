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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level =0;
        TreeNode cu = new TreeNode(0);
        while(!q.isEmpty())
        {
            int n = q.size();
            ArrayList<TreeNode> al= new ArrayList<>();
            for(int i =0 ;i<n;i++)
            {
                TreeNode c = q.peek();
                if(c.left!=null) q.add(c.left);
                if(c.right!=null) q.add(c.right);
                if(level%2!=0)
                {
                al.add(c);
                }
                cu = q.peek();
                q.remove();
            }
            if(level%2!=0)
            {
                for(int i =0 ;i<al.size()/2 ;i++)
                {
                    int value = al.get(i).val;
                    al.get(i).val = al.get(al.size()-1-i).val;
                    al.get(al.size()-1-i).val=value;
                }
            }
            level++;
    }
    return root;
}
}