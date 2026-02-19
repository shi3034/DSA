class Solution {
    public int[] sortArray(int[] nums) {
        int min=nums[0],max=nums[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int index=0;
        for(int i=min;i<=max;++i){
            while(map.getOrDefault(i,0)>0){
                nums[index]=i;
                index=index+1;
                map.put(i,map.get(i)-1);
            }
        }
        return nums;
    }
}