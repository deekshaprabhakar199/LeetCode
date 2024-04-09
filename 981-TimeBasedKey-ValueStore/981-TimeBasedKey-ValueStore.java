        Integer tkey = tmap.floorKey(timestamp);
        String ans = (tkey == null) ? "" : tmap.get(tkey);
        TreeMap<Integer, String> tmap = dict.get(key);
    public String get(String key, int timestamp) {
        if(!dict.containsKey(key)) return "";
        if(!dict.containsKey(key)) dict.put(key, new TreeMap<>());
        dict.get(key).put(timestamp,value);
    }
    
        dict = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
class TimeMap {
    HashMap<String, TreeMap<Integer, String>> dict = new HashMap<>();
    public TimeMap() {
[
