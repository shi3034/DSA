class Solution {
    public boolean isAnagram(String s, String t) {
        int count[]=new int[26];
        if(s.length()!=t.length())
        return false;
        s=s.toLowerCase();
        t=t.toLowerCase();
        for(char c: s.toCharArray())
            count[c - 'a']++;
        for(char c: t.toCharArray())
            count[c - 'a']--;
        for(int val:count){
            if(val!=0) return false;
            }
        return true;
    }
}