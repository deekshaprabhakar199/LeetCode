
    public int calculateDepth(TreeNode curr){
        if(curr==null) return 0;
        int left = calculateDepth(curr.left);
        int right = calculateDepth(curr.right);
        if(left == -1 || right == -1) return -1;
        if(Math.abs(left-right)>1) return -1;
        return (Math.max(left,right)+1);
    }
}
[
