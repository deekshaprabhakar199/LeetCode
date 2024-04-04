        int prev = nums[start];  
        int next = Math.max(nums[start], nums[start+1]);
        for( int i=start+2; i<=n; i++){
            int curr= Math.max(prev+nums[i], next);
            prev = next;
            next = curr;
        }
        return next;
        
    }
}
    public int robHelper(int start, int n, int[] nums){

    }
        return Math.max(rob1, rob2);
[
