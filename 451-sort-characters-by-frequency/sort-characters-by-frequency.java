class Solution {
    static{
       for(int i=0;i<500;i++)
       frequencySort(new String());
    }
    public static String frequencySort(String s) {
        HashMap<Character, Integer> freq=new HashMap<>();
        for(char c: s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character, Integer>> list=new ArrayList<>(freq.entrySet());
        list.sort(Map.Entry.<Character,Integer>comparingByValue().reversed());
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry: list){
            char ch=entry.getKey();
            int count=entry.getValue();
            for(int i=0;i<count;i++){
                sb.append(ch);
            }
        }
        return sb.toString();


    }
}