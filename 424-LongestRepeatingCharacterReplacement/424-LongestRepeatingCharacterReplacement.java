            
            maxf=Math.max(maxf, freq.get(str[r]));
            while(r-l+1-maxf >k){
                freq.put(str[l], freq.get(str[l])-1);
                if(freq.get(str[l])==0) freq.remove(str[l]);
                l++;
            }
            length = Math.max(length, r-l+1);
            r++;
        }
            freq.put(str[r],freq.getOrDefault(str[r],0)+1);
        while(r<str.length){

        HashMap<Character, Integer> freq = new HashMap<>();
        char[] str = s.toCharArray();
"
