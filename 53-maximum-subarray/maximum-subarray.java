class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0,maxSum=Integer.MIN_VALUE,n=nums.length,i=0;
        while(i<n){
            currSum+=nums[i];
            if(currSum>maxSum)
            {
                maxSum=currSum;
            }
            if(currSum<0)
            currSum=0;
            i++;
        }
        return maxSum;
    }
}