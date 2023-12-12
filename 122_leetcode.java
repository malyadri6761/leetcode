class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        TreeNode temp1=root.left;
            root.left=root.right;
            root.right=temp1;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
