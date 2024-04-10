class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Comparator.comparingInt(p -> p.distance));
        for(int[] temp : points)
            maxHeap.offer(new Pair(findDistance(temp[0] , temp[1]), temp[0], temp[1]));
        int ans[][] = new int[k][2];
        int idx = 0;
        while(idx < k){
            ans[idx][0] = maxHeap.peek().x;
            ans[idx][1] = maxHeap.peek().y;
            maxHeap.poll();
            idx++;
        }
        return ans;
    }
    public int findDistance(int x,int y){
        return (x * x) + (y * y);
    }
}
[
