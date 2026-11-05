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
    public boolean findTarget(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                TreeNode temp = root;
                TreeNode vr = q.peek();
                int value = k - vr.val;
                while(temp!=null){
                    if(temp!=vr && temp.val==value) return true;
                    else if(temp.val>value) temp=temp.left;
                    else temp = temp.right;
                }
                if(vr.left!=null) q.add(vr.left);
                if(vr.right!=null) q.add(vr.right);
                q.remove();
            }
        }
        return false;
    }
}