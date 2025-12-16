class Solution {
    public int maxAscendingSum(int[] nums) {
        int i=0,max=0;
        while(i<nums.length){
        int sum=0;
        while(i+1<nums.length && nums[i]<nums[i+1]){
            sum+=nums[i];
            i++;
        }
        sum+=nums[i++];
        if(sum>max)
        max=sum;
        }
        return max;
    }
}