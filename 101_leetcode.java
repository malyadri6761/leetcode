class Solution {
    public boolean symmetric(TreeNode l,TreeNode r){
        if(l==null || r==null)
            return l==r;
        return l.val==r.val && symmetric(l.left,r.right) && symmetric(l.right,r.left);
    }
    public boolean isSymmetric(TreeNode root){
        return symmetric(root.left,root.right);
    }
}
