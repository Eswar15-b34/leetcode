class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if (depth == 1) {
            TreeNode t = new TreeNode(val);
            t.left = root;
            return t;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int level = 1;

        while (!q.isEmpty()) {

            int n = q.size();

            if (level == depth - 1) {

                for (int i = 0; i < n; i++) {

                    TreeNode cur = q.poll();

                    TreeNode t = new TreeNode(val);
                    TreeNode ti = new TreeNode(val);

                    t.left = cur.left;
                    ti.right = cur.right;

                    cur.left = t;
                    cur.right = ti;
                }

                break;
            }

            for (int i = 0; i < n; i++) {

                TreeNode cur = q.poll();

                if (cur.left != null)
                    q.add(cur.left);

                if (cur.right != null)
                    q.add(cur.right);
            }

            level++;
        }

        return root;
    }
}