class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> anagram = new HashMap<>();
        for(Character c: s.toCharArray()){
            anagram.put(c,anagram.getOrDefault(c,0)+1);
        }
        for(Character c: t.toCharArray()){
        }
    }
            anagram.put(c,anagram.getOrDefault(c,0)-1);
            if(anagram.get(c)==0) anagram.remove(c);
        return anagram.isEmpty();
}
"
