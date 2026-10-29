class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int left_prod=1;
        int[] ans=new int[n];
        int[] left=new int[n];
        for(int i=0;i<n;i++)
        {
            left_prod*=nums[i];
            left[i]=left_prod;
        }
        int right_prod=1;
        for(int j=n-1;j>0;j--)
        {
            ans[j]=left[j-1]*right_prod;
            right_prod*=nums[j];
        }
        ans[0]=right_prod;
        return ans;
    }
}