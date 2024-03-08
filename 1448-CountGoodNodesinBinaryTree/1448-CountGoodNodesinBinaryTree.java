class Solution {
    public int goodNodes(TreeNode root) {
        return backtrack(root,root.val);
    }

    public int backtrack(TreeNode root, int max){
        
        if(root==null){
            return 0;
        }
        
        int count=0;
        if(root.val>=max){
[
