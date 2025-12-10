class Solution {
    /*static{
        for(int i=0;i<500;i++)
        topKFrequent(new int[]{1,2,2,1,3},2);
    }*/
    public static int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        List<Integer>[] arr=new List[n+1];
        for(int num=0;num<=n;num++){
            arr[num]=new ArrayList<>();
        }
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int val=entry.getValue();
            arr[val].add(entry.getKey());
        }
        int count=0;
        for(int j=n;j>=1 && count<k;j--){
            List<Integer> list=arr[j];
            if(!list.isEmpty())
            {
                for(int p:list){
                ans[count++]=p;
                if(count==k)
                return ans;
                }
            }
        }
        return ans;
    }
}