class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int zeros=0,prod=1;;
        for(int val:nums){
            if(val==0)
            zeros++;
            else
            prod=prod*val;
        }
        for(int i=0;i<res.length;i++){
            if(zeros>1)
            res[i]=0;
            else if(zeros==1)
            res[i]=(nums[i]==0)?prod:0;
            else
            res[i]=prod/nums[i];
        }
        return res;
    }
}