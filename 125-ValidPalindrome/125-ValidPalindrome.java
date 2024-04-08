                }
                l++;
            }
            else if(!isAlphanumeric(str[r])) r--;
            else {
                if(str[l] != str[r]) {
                    return false;
        while(l<=r){
            if(!isAlphanumeric(str[l])){
                l++;
                r--;
            }
        }
        return true;
    }
"
