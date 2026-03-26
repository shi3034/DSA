class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int left=0,right=0,maxLen=0,maxFreq=0;
        int arr[]=new int[26];
        while(right<n)
        {
            arr[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,arr[s.charAt(right)-'A']);
            int size=right-left+1;
            if(size-maxFreq>k)
            {
            arr[s.charAt(left)-'A']--;
            left++;
            }
            else
            maxLen=Math.max(maxLen,size);
            right++;
        }
        return maxLen;
    }
}