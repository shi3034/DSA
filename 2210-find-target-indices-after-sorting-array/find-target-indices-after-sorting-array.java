class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int count=0,occ=0;
        for(int i=0;i<n;i++){
            if(nums[i]<target)
            count++;
            else if(nums[i]==target)
            occ++;
        }
        if(occ>1){
        for(int i=count;i<=count+occ-1;i++)
        ans.add(i);
        }
        else if(occ==1)
        ans.add(count);
        else
        return ans;
        return ans;
    }
}