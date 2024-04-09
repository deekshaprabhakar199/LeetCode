        if(root == null) return false;
        boolean curr = isSame(root, subRoot);
        if(curr) return curr;
        else{
            boolean left = isSubtree(root.left, subRoot);
            boolean right = isSubtree(root.right, subRoot);
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            return left || right;
        }
        
    }

    public boolean isSame(TreeNode p, TreeNode q){
        if( p==null && q==null) return true;
        if( p==null && q != null || p != null && q== null) return false;
        if(p.val == q.val){
[
