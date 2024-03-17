            else if(nums[mid]>target && nums[mid]>nums[nums.length-1]){
                l = mid+1;
            }
            else if(nums[mid]>target && nums[mid]<nums[nums.length-1]){
                r = mid-1;
            }
            else {
                r = mid-1;
            }
        }
        return -1;
    }
}
[
