        for( int i=0; i< tasks.length; i++){
            freq.put(tasks[i], freq.getOrDefault(tasks[i],0)+1);
        }
            maxCount = Math.max(maxCount, freq.get(tasks[i]));
        for( int i: freq.values()){
            if(i==maxCount){
        }
                taskCount++;
            }
        int result = ((maxCount -1) * (n+1)) + taskCount;
        return Math.max(tasks.length, result);
    }
}
[
