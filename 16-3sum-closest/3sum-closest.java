class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE,ans=0;
        for(int i=0;i<n-2;i++)
        {
            int complement=target-nums[i];
            int currentSum=nums[i]+twoSum(nums,n,i,complement);
            if(Math.abs(target-currentSum)<=min)
            {
                min=Math.abs(target-currentSum);
                ans=currentSum;
            }
        }
        return ans;    
    }
    private int twoSum(int[] nums, int n, int start, int complement)
    {
        int i=start+1,j=n-1, minDiff=Integer.MAX_VALUE,sum=0,finalSum=0;
        while(i<j)
        {
            sum=nums[i]+nums[j];
            if((Math.abs(complement-sum))<minDiff)
            {
                minDiff=Math.abs(complement-sum);
                finalSum=sum;
            }
            if(sum>complement)
            j--;
            else if(sum<complement)
            i++;
            else
            return sum;
        }
        return finalSum;
    }
}