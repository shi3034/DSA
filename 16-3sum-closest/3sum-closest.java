class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int[] sums=new int[n];
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
            int complement=target-nums[i];
            sums[i]=nums[i]+twoSum(nums,n,i,complement);
        }
        int min=Integer.MAX_VALUE,ans=0;
        for(int i=0;i<n-2;i++)
        {
            if(Math.abs(target-sums[i])<=min)
            {
                min=Math.abs(target-sums[i]);
                ans=sums[i];
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