��������int[]�ans�=�new�int[nums.length];
��������ans[0]=1;
��������for(int�i=1;�i<nums.length;�i++){
������������ans[i]�=�ans[i-1]�*�nums[i-1];
��������}
��������int�multiplier�=�1;
��������for(�int�i=�nums.length-1;�i>=0;�i--){
������������ans[i]=�ans[i]�*�multiplier;
��������}
����}
������������multiplier�=�multiplier�*�nums[i];
}
class�Solution�{
����public�int[]�productExceptSelf(int[]�nums)�{
��������return�ans;

[
