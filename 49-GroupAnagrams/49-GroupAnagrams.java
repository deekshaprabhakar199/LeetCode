    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, ArrayList<String>> anagram = new HashMap<>();
       for(String s1 : strs){
        char[] s2=s1.toCharArray();
        Arrays.sort(s2);
        String s3 = new String(s2);
        anagram.putIfAbsent(s3,new ArrayList<>());
        anagram.get(s3).add(s1);
       } 
       return new ArrayList<>(anagram.values());
    }
class Solution {
[
