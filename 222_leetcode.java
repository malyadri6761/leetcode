class Solution {
    int n=0;
    public int countNodes(TreeNode root) {
        if(root==null)
            return n;
        n+=1;
        n=countNodes(root.left);
        n=countNodes(root.right);
        return n;
        
    }
}
