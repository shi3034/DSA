class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int[] hash=new int[n+1];
        Arrays.fill(hash,-1);
        for(int i=0;i<n;i++){
            hash[nums[i]]=0;
        }
        for(int j=0;j<hash.length;j++){
            if(hash[j]==-1)
            return j;
        }
        return 0;
    }
}