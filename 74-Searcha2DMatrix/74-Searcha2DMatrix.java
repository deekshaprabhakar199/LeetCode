            else if(matrix[mid][cols-1] < target){
            }
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        int l2=0, r2= cols-1;
        while(l2<=r2){
            int mid= l2+(r2-l2)/2;
            if(matrix[finalRow][mid]==target){
                return true;
[
