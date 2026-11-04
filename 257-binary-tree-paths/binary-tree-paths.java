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
    void fun(TreeNode root , String st , List<String> s)
    {
         if(root==null) {  return ;}
         if(st.equals(""))
         {
            st=String.valueOf(root.val);
         }
         else
         {
        st = st+"->"+root.val;
         }
         
        fun(root.left,st,s);
        fun(root.right,st,s);
        if(root.left ==null && root.right==null)
        {
        s.add(st);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> s = new ArrayList<>();
        String St= "";
        fun(root ,St,s);
        return s;
       


        
    }
}