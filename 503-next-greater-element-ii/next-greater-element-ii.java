class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int size=nums.length;
        int ans[]=new int[size];
        Stack<Integer> st=new Stack<>();
        for(int i=2*size-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%size])
            st.pop();
            if(i<size)
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(nums[i%size]);
        }
        return ans;
    }
}