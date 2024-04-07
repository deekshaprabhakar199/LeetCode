class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(Character c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        for(Character c: t.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)-1);
        }
    }
        return freq.isEmpty();
            if(freq.get(c)==0) freq.remove(c);
}
"
