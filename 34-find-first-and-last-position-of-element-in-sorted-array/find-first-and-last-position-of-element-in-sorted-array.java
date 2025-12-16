class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        int i=0,n=nums.length;
        while(i<n && nums[i]!=target)
            i++;
        if(i==n){
        ans[0]=-1;
        ans[1]=-1;
        return ans;
        }
        else
        ans[0]=i;
        while(i<n && nums[i]==target)
        i++;
        ans[1]=i-1;
        return ans;

    }
}