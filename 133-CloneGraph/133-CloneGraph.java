    }
        HashMap<Integer, Node> hmap = new HashMap<>();
    public Node cloneGraph(Node node) {
class Solution {
        if(node == null) return node;
        return cloneHelper(node, hmap);

    public Node cloneHelper(Node node, HashMap<Integer, Node> hmap){
        if(hmap.containsKey(node.val)){
            return hmap.get(node.val);
        }
        Node clone = new Node(node.val);

        for( Node n : node.neighbors){
            clone.neighbors.add(cloneHelper(n,hmap));

*/
        }

        return clone;
        hmap.put(node.val,clone);
[
