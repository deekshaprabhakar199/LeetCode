            ans[i] = ans[i-1] * nums[i-1];
        }
        int suffix = 1;
        for( int i = nums.length-1; i>=0; i--){
            ans[i] = suffix * ans[i];
            suffix = suffix * nums[i];
        for( int i=1; i< nums.length; i++){
        ans[0]=1;
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
class Solution {
[
