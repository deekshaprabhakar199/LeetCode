class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0, r=numbers.length-1;
        while(l<r){
            sum = numbers[l] + numbers[r];
        int sum=0;
            if(sum>target){
                r--;
            }
            else if(sum <target){
                l++;
            }
[
