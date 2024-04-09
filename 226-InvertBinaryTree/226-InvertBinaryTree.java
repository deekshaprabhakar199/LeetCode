    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            TreeNode curr = bfs.poll();
            if(curr != null){
                TreeNode temp = curr.left;
                curr.left= curr.right;
                curr.right = temp;
                if(curr.left != null) bfs.offer(curr.left);
                if(curr.right != null) bfs.offer(curr.right);
            }
        }
        return root;
    }
}
class Solution {
[
