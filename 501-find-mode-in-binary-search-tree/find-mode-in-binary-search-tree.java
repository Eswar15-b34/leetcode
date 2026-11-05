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
    void pre(TreeNode root , HashMap<Integer,Integer> map)
    {
        if(root==null)
        {
            return;
        }
       map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        pre(root.left,map);
        pre(root.right,map);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        pre(root, hm);
        int m = Integer.MIN_VALUE;
        for(int val : hm.values())
        {
            m = Math.max(val,m);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int k : hm.keySet())
        {
            if(hm.get(k)==m)
            {
                al.add(k);
            }
        }
        int[] arr = new int[al.size()];
        for(int i =0 ;i<al.size();i++)
        {
            arr[i]=al.get(i);
        }
        return arr;
    }
}