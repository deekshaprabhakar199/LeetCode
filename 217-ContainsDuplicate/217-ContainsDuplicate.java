        HashSet<Integer> unique = new HashSet<>();
        for( int i: nums){
            if(!unique.add(i)) {
                return true;
            }
        }
        return false;
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
[
