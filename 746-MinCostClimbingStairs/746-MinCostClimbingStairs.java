        int[] ans = new int[n];
    public int minCostClimbingStairs(int[] cost) {
class Solution {
        int n= cost.length;
        for( int i=0; i< n; i++){
            if(i<2) ans[i] = cost[i];
        }
    }
            else ans[i] = Math.min(ans[i-2], ans[i-1]) + cost[i];
        return Math.min(ans[n-1], ans[n-2]);
}
[
