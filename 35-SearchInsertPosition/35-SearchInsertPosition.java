            else if(nums[mid]>target){
                r= mid-1;
            }
            else{
                l = mid+1;
                ans = mid+1;
            }
        }
        return ans;
    }
}
[
