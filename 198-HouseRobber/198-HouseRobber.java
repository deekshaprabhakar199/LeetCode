        if(n<2) return nums[0];
        int prev = nums[0];
        int next = Math.max(prev, nums[1]);
        for( int i= 2; i<n; i++ ){
            int curr = Math.max(prev+ nums[i], next);
            prev = next;
            next = curr;
        }
        return next;
    }
    
}
class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
[
