class Solution {
    public int findMin(int[] nums) {
        int l=0, r= nums.length-1;
        int mid=0;
        while(l<=r){
            mid= l+(r-l)/2;
            if(nums[mid] < nums[r]){
                r=mid;
            }
            else{       // mid is already greater than right, so it can never be the minimum element
                l = mid+1;
            }
        }
        return nums[mid];
    }
}
[3,4,5,1,2]
