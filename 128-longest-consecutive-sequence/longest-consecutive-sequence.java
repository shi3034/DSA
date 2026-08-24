class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length,l=0,max=0;
        if(n==0)
        return 0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++)
        {
            if(nums[i+1]-nums[i]==1)
            {
                l++;
                if(l>max)
                max=l;
            }
            else if(nums[i+1]-nums[i]==0)
            continue;
            else
            l=0;
        }
        return max+1;
    }
}