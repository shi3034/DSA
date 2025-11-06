class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int [] sort = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int i = nums.length - 1; 
        while(left <= right)
        {
            if(nums[left] * nums[left] > nums[right] * nums[right])
            {
                sort[i] = nums[left] * nums[left];
                left++;
            }
            else
            {
                sort[i] = nums[right] * nums[right];
                right--;
            }
            i--;
        }    
        return sort;
    }
}