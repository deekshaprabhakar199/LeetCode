    public boolean isValidBST(TreeNode root) {
        return checkValid(root, null, null);
    }

    public boolean checkValid(TreeNode root, Integer min, Integer max){
        if(root == null){
            return true;
        }
        if(min != null && root.val <= min || max != null && root.val >= max ){
            return false;
        }
        boolean left = checkValid(root.left,null, root.val);
        boolean right = checkValid(root.right, root.val, null);
        return left && right;
class Solution {
 */
    }
[
