class TimeMap {
    class Pair
    {
        int timestamp;
        String value;
        Pair(int timestamp, String value)
        {
            this.timestamp=timestamp;
            this.value=value;
        }
    }
    HashMap<String,List<Pair>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        List<Pair> list=map.get(key);
        if(list==null)
        {
            list=new ArrayList<>();
            map.put(key,list);
        }
        list.add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key))
        {
            List<Pair> list=map.get(key);
            int index=bs(0,list.size()-1,list,timestamp);
            if(index==-1)
            return "";
            else
            return list.get(index).value;
        }
        return "";
    }
    private int bs(int start,int end,List<Pair> list, int timestamp)
    {
        int ans=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(timestamp<list.get(mid).timestamp)
            end=mid-1;
            else if(timestamp>list.get(mid).timestamp)
            {
            start=mid+1;
            ans=mid;
            }
            else
            return mid;
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */