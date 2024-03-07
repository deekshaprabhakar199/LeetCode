class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] str1 = new int[26];
        int[] str2 = new int[26];

        for( int i=0; i< l1;i++){
            str1[s1.charAt(i)-'a'] ++;
        }
            str2[s2.charAt(i)-'a']++;
        if(Arrays.equals(str1,str2)) return true;
        for( int i = l1; i< l2; i++){
        int l1 = s1.length();
        int l2 = s2.length();
        if(s1.length()==0) return true;
        if(s1.length() > s2.length()) return false;
"
