                if(i>0) up = dp[i-1][j];
                if(j>0) left = dp[i][j-1];
                dp[i][j] = up+left;
                System.out.println(dp[i][j]);
                int up=0, left=0;
                    continue;
                }
        for(int i =0; i< m; i++){
            for( int j=0; j< n; j++){
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
        int[][] dp = new int[m][n];
    public int uniquePaths(int m, int n) {
class Solution {
3
