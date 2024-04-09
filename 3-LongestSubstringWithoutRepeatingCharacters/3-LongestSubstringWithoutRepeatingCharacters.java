class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r=0, maxLength=0;
        while(r<s.length()){
            while(!unique.add(str[r])){
        }
        HashSet<Character> unique = new HashSet<>();
                maxLength = Math.max(maxLength, unique.size());
            }
    }
        char[] str = s.toCharArray(); 
                unique.remove(str[l]);
                l++;
            unique.add(str[r]);
            r++;
        return Math.max(maxLength, unique.size());
}
"
