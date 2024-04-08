        for( int i=0; i<position.length; i++){
            time[position[i]] = (double)(target- position[i]) / speed[i]; 
        }
        for(int i = time.length-1; i>=0; i--){
            double curr = time[i];
        }
        double prev = 0.0;
            if(curr > prev){
                prev = curr;
            }
    }
                fleets++;
        return fleets;
}
//time[position[i]] is the asn to optimisation
1
