    public int characterReplacement(String s, int k) {
        int l=0, r=0, maxf =0, length=0;
class Solution {
        while(r<str.length){
        char[] str = s.toCharArray();
        HashMap<Character, Integer> freq = new HashMap<>();
            freq.put(str[r], freq.getOrDefault(str[r],0)+1);
        }
            maxf = Math.max(maxf, freq.get(str[r]));

            while(r-l+1-maxf > k){      // freq of non- most common char >k
                freq.put(str[l], freq.get(str[l])-1);
            }
                if(freq.get(str[l])==0) freq.remove(str[l]);
                l++;
            length = Math.max(length, r-l+1);
            r++;
"
