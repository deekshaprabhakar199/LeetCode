class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(sum.containsKey(target-nums[i])){
        }
                return new int[] {i,sum.get(target-nums[i])};
            }
    }
            sum.put(nums[i],i);
        return new int[] {0,0};
}
[
