        int prev = nums[start];  
        int next = Math.max(nums[start], nums[start+1]);
        for( int i=start+2; i<=n; i++){
            int curr= Math.max(nums[i-2]+nums[i], nums[i-1]);
            prev = next;
    public int robHelper(int start, int n, int[] nums){

            next = curr;
        }
        return next;
        
    }
}
[
