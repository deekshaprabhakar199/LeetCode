        if(amount<1) return 0;
    public int coinChange(int[] coins, int amount) {
        int[] money = new int[amount+1];

        for( int i=1; i<= amount; i++){
            money[i] = Integer.MAX_VALUE;
        }

            for( int coin:coins){
                if(coin <= i && money[i-coin] != Integer.MAX_VALUE){
            }
                    money[i] = Math.min(money[i], 1+money[i-coin]);
                }
    }
        return money[amount] == Integer.MAX_VALUE ? -1 : money[amount];
}
class Solution {
[
