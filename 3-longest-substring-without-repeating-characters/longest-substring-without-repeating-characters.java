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
            if(hash[s.charAt(right)]!=-1)
            {
                if(hash[s.charAt(right)]>=left)
                left=hash[s.charAt(right)]+1;
            }
            max=Math.max(max,right-left+1);
            hash[s.charAt(right)]=right;
            right++;
        }
        return max;
    }
}