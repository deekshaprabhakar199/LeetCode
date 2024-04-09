        while(!bfs.isEmpty()){
            int level = bfs.size();
            List<Integer> levelWise = new ArrayList<>();
            for( int i=0; i< level; i++){
                if(bfs.peek().left != null) bfs.add(bfs.peek().left);
                if(bfs.peek().right != null) bfs.add(bfs.peek().right);
                levelWise.add(bfs.poll().val);
            }
            order.add(levelWise);
        bfs.offer(root);
        if(root == null){
        List<List<Integer>> order = new ArrayList<>();
        Queue<TreeNode> bfs = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
class Solution {
 */
            return order;
        }
[
