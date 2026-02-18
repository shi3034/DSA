class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            int[] count=new int[26];
            for(char ch:s.toCharArray()){
                count[ch-'a']++;
            }
            String freq=Arrays.toString(count);
            map.putIfAbsent(freq,new ArrayList<>());
            map.get(freq).add(s);
        }
        return new ArrayList<>(map.values());
    }
}