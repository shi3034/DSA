class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        set.add(num);
        int max=0;
        for(int num:set)
        {
            int l=0;
            if(!set.contains(num-1))
            {
                int current=num;
                while(set.contains(current++))
                {
                    l++;
                }
                max=Math.max(max,l);
            }
        }
        return max;
    }
}