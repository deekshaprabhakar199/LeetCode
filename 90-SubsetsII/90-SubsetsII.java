
    public void backtrack(List<Integer> temp, int[] nums, int start){
        result.add(new ArrayList<>(temp));
        for( int i=start; i< nums.length; i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            backtrack(temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
[
