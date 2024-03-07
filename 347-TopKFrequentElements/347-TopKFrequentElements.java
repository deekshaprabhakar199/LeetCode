        HashMap<Integer, Integer> freqMap = new HashMap<>();
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        for(int i: nums){
            freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> freq= new ArrayList<>(freqMap.keySet());
        freq.sort((a,b)-> freqMap.get(b)- freqMap.get(a));
        for(int i=0; i<k; i++){
            ans[i]=freq.get(i);
        }
    }
        int[] ans= new int[k];
        return ans;
[
