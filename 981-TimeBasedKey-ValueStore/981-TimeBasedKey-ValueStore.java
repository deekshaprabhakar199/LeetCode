        if(!dict.containsKey(key)){
            return "";
        }
        TreeMap<Integer,String> tmap = dict.get(key);
        Integer hkey= tmap.floorKey(timestamp);
        String val = hkey == null ? "": tmap.get(hkey);
    public String get(String key, int timestamp) {
    
    }
        dict.get(key).put(timestamp, value);
        return val;

    }
[
