/*class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] sorted=s.toCharArray();
            Arrays.sort(sorted);
            String str=Arrays.toString(sorted);
            map.putIfAbsent(str,new ArrayList<>());
            map.get(str).add(s);
        }
        return new ArrayList<>(map.values());
    }
}*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Long,List<String>> map=new HashMap<>();
        for(String str:strs){
            long key=getUniqueKey(str);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public Long getUniqueKey(String str){
        int[] primes={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103};
        long mul=1;
        for(char ch:str.toCharArray()){
            mul=mul*primes[ch-'a'+1];
        }
        return mul;
    }
}
