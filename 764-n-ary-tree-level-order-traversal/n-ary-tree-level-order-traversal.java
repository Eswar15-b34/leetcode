/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>  ans = new ArrayList<>();
         if(root==null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            Node temp = new Node(0);
            List<Integer>  al = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                Node cur = q.peek();
                for(Node child : cur.children)
                {
                    q.add(child);
                }
                al.add(cur.val);
                q.remove();
            }
            ans.add(al);
        }
        return ans;
    }
}