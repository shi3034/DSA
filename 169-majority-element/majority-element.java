class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 1) 
        return nums[0];
        return nums[n/2];
    }
}