class Solution {
    public void sortColors(int[] nums) {
        int zero=0,one=0,two=0;
        for(int num:nums){
            if(num==0)
            zero++;
            else if(num==1)
            one++;
            else
            two++;
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(c<zero){
            nums[i]=0;
            c++;
            }
            else if(c<zero+one){
            nums[i]=1;
            c++;
            }
            else
            nums[i]=2;
        }
    }
}