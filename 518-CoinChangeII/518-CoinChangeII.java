        if (dp[ind][amt] != -1)
            return dp[ind][amt];

        int not = f(ind - 1, amt, coins, dp);
        int take = 0;
        if (coins[ind] <= amt)
            take =  f(ind, amt - coins[ind], coins, dp);

        return dp[ind][amt] = take + not;
    }

   
    public int change(int amt, int[] coins) {
         int n = coins.length;

        }
                return 0;
            else
                return 1;
            if (amt % coins[ind] == 0)
        if (ind == 0) {
class Solution {
     int f(int ind, int amt, int coins[], int dp[][]) {
5
