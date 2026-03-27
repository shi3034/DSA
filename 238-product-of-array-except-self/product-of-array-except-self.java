class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        Arrays.fill(res,0);
        int zeros=0,prod=1;;
        for(int val:nums){
            if(val==0)
            zeros++;
            else
            prod=prod*val;
        }
        if(zeros>1)
            return res;
        for(int i=0;i<n;i++){
            if(zeros==1)
            res[i]=(nums[i]==0)?prod:0;
            else
            res[i]=prod/nums[i];
        }
        return res;
    }
}