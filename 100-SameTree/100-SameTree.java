 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
 * }
 *     }
 *         this.right = right;
 *         this.left = left;
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
        else if(p == null && q != null || q == null && p != null) return false;
        if(p.val == q.val){
            boolean left = isSameTree(p.left, q.left);
        }
            boolean right = isSameTree(p.right, q.right);
            return left && right;
    }
        return false;
}
[
