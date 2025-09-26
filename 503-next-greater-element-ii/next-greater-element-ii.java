class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int size=nums.length;
        int ans[]=new int[size];
        int[] st=new int[size];
        int top=-1;
        for(int i=2*size-1;i>=0;i--){
            int currIndex=i%size;
            int currNum=nums[currIndex];
            while(top>=0 && st[top]<=currNum)
            top--;
            if(i<size)
            ans[i]=top<0?-1:st[top];
            st[++top]=nums[i%size];
        }
        return ans;
    }
}