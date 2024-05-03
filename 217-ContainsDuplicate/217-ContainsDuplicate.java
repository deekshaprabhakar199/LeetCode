class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        for( int i: nums){
            if(!unique.add(i)) return true;
        }
        return false;
    }
}
[1,2,3,1]
