
        }
            dp[m-1][j] = triangle.get(m-1).get(j);
        for(int j=0; j< m; j++){     //base case

        int[][] dp = new int[m][m];
        //int n= m; //triangle.get(0).size();
        int m= triangle.size();
        for( int i=m-2; i>=0; i--){
            for( int j=i; j >= 0; j--){
                int d=Integer.MAX_VALUE, dn = Integer.MAX_VALUE;
                if(i<m-1) d= triangle.get(i).get(j) + dp[i+1][j];
                if(i<m-1) dn = triangle.get(i).get(j) + dp[i+1][j+1];
    public int minimumTotal(List<List<Integer>> triangle) {
class Solution {
[
