class Solution {
    boolean iden(TreeNode r1, TreeNode r2) {

        if(r1 == null && r2 == null)
            return true;

        if(r1 == null || r2 == null)
            return false;

        if(r1.val != r2.val)
            return false;

        return iden(r1.left, r2.left) &&
               iden(r1.right, r2.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return iden(p, q);
    }
}