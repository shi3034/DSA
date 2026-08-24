class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        set.add(num);
        int n=nums.length,max=0;
        if(n==0)
        return 0;
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int current=num;
                int l=1;
                while(set.contains(current+1))
                {
                    current++;
                    l++;
                }
                max=Math.max(max,l);
            }
        }
        return max;
    }
}