        }
            bucket[frequency].add(i);
        for( int i= bucket.length-1;i>=0; i--){
            if(bucket[i] != null){
                for(int num: bucket[i]){
                    result[index] = num;
                    index++;
                }
            }
        }
        return result;
                    if(index == k){
                        return result;
                    }
    }
}
[
