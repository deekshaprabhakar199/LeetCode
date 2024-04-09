        }
            str2[s2.charAt(i)-'a']++;
        if(Arrays.equals(str1,str2)) return true;
        for(int i=l1; i<l2; i++){
            str2[s2.charAt(i-l1)-'a']--;
            str2[s2.charAt(i)-'a']++;
            str1[s1.charAt(i)-'a']++;
        for( int i=0; i<l1; i++){
        if(s1.length() > s2.length()) return false;
        int l1= s1.length(), l2= s2.length();
        if(s1.length() ==0) return true;
        int[] str2 = new int[26];
        int[] str1 = new int[26];
class Solution {
    public boolean checkInclusion(String s1, String s2) {
            if(Arrays.equals(str1,str2)) return true;
        }
        return false;
    }
}

//Time = O(s2.length())
//spcae = O(1)
"
