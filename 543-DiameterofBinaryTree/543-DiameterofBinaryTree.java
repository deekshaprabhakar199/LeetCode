 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        calculateDepth(root);
    }
    int diameter=0;
        return diameter;

    public int calculateDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = calculateDepth(root.left);
        int right = calculateDepth(root.right);
    }

        diameter = Math.max(diameter, left+right);
        return Math.max(left,right)+1;
[
