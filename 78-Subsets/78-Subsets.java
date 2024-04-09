class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(new ArrayList<>(), nums, 0);
    }
        return result;
    List<List<Integer>> result = new ArrayList<>();


    public void backtrack(List<Integer> temp, int[] nums, int start){
        result.add(new ArrayList<>(temp));
        for( int i=start; i< nums.length; i++ ){
            temp.add(nums[i]);
        }
    }
            backtrack(temp, nums, i+1);
            temp.remove(temp.size()-1);
}
[
