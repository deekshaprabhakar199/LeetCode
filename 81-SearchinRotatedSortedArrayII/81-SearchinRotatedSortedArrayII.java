                continue;
            }
            else if(nums[mid] <= nums[r]){
                if(nums[mid]<target && target <= nums[r]){
                    l = mid+1;
                }
                else{
                    r = mid-1;
                }
            }
            else{
                if(nums[l]<= target && target<nums[mid]){
                    r = mid-1;
                }
                r = r-1;
[
