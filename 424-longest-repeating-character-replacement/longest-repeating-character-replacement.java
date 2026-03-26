class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int left=0,right=0,maxLen=0,maxFreq=0;
        int arr[]=new int[26];
        char str[]=s.toCharArray();
        while(right<n)
        {
            arr[str[right]-'A']++;
            maxFreq=Math.max(maxFreq,arr[str[right]-'A']);
            while((right-left+1)-maxFreq>k)
            {
            arr[str[left]-'A']--;
            left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}