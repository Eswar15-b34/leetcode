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
    TreeNode  fun(int s , int e ,int[] nums)
    {
     if(s>e) return null;
     int m = (s+e)/2;
     TreeNode  root = new  TreeNode(nums[m]);
     root.left = fun(s , m-1 ,nums);
     root.right = fun(m+1, e , nums);
      return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
    return fun(0,nums.length-1, nums);

}
}