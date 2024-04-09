    public Set<String> helper(int n,Set<String> dp[]){
    }
        return res; 
       
        Set<String> dp[] = new HashSet[n+1];
        List<String> res = new ArrayList<>(helper(n,dp));
class Solution {
    public List<String> generateParenthesis(int n) {



        if(n==1){
            Set<String> res = new HashSet<>();
            res.add("()");
            return res;
        }
        if(dp[n]!=null)
            return dp[n];

        Set<String> res = new HashSet<>();
        for(int i=1;i<n;i++){
            Set<String> left = helper(i,dp);
            Set<String> right = helper(n-i,dp);
            if(i==1){
3
