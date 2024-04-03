        int next = cost[1];
        for ( int i=2; i< n; i++){
            int curr =  cost[i]+ Math.min(next, prev);
        }
            prev = next;
            next = curr;
        return Math.min(prev,next);
        int prev= cost[0];
        int n= cost.length;
    public int minCostClimbingStairs(int[] cost) {
    }
}
[
