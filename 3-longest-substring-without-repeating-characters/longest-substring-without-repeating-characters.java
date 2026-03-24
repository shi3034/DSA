class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==1)
        return 1;
        if(n==0)
        return 0;
        int[] hash=new int[256];
        Arrays.fill(hash,-1);
        int left=0,right=0,max=1;
        while(right<n)
        {
            char ch=s.charAt(right);
            if(hash[ch]!=-1)
            {
                if(hash[ch]>=left)
                left=hash[ch]+1;
            }
            max=Math.max(max,right-left+1);
            hash[ch]=right;
            right++;
        }
        return max;
    }
}