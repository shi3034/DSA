class Solution {
    public int majorityElement(int[] nums) {
        int count=0,num=0;
        for(int n:nums){
            if(count==0)
            num=n;
            count+=(n==num)?1:-1;
        }
        return num;
    }
}