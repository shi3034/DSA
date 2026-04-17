class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length,st=0,end=n-1;
        while(st<=end)
        {
        int mid=st+(end-st)/2;
        if(target>nums[mid])
        st=mid+1;
        else if(target<nums[mid])
        end=mid-1;
        else
        return mid;
        }
        return -1;
    }
}