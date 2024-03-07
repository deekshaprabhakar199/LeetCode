        int currLength=0;
        for( int i: nums){
            unique.add(i);
        }
        for( int i: nums){
            if(!unique.contains(i-1)){
        }
        int maxLength=0;
                currLength=1;
            }
                while(unique.contains(i+1)){
                    currLength++;
                }
    }
                    i++;
                maxLength = Math.max(maxLength, currLength);
        return maxLength;
}
[
