class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int num=0;num<n-2;num++)
        {
            if(num>0 && nums[num]==nums[num-1])
            continue;
            int i=num+1,j=n-1;
            while(i<j)
            {
            int sum=nums[i]+nums[j]+nums[num];
            if(sum==0)
            {
                List<Integer> list=new ArrayList<>();
                list.add(nums[num]);
                list.add(nums[i]);
                list.add(nums[j]);
                ans.add(list);
                i++;
                j--;

                while(i<j && nums[i]==nums[i-1])
                i++;
                while(i<j && nums[j]==nums[j+1])
                j--;
            }
            else if(sum<0)
            i++;
            else
            j--;
            }
        }
        return ans;
    }
}