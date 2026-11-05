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
    int pre (Node root)
    {
        if(root==null) return 0;
        int c=0;
        for(Node child : root.children )
        {
            c=Math.max(c,pre(child));
        }
        return 1+c;

    }
    public int maxDepth(Node root) {
        return pre(root);
    }
}