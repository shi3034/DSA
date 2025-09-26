class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> num=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
        while(!st.isEmpty() && st.peek()<=nums2[i])
        st.pop();
        if(st.isEmpty()){
        st.push(nums2[i]);
        num.put(nums2[i],-1);
        }
        else{
        num.put(nums2[i],st.peek());
        st.push(nums2[i]);
        }
        }
        int nge[]=new int[nums1.length];
        for(int j=0;j<nums1.length;j++){
            nge[j]=num.get(nums1[j]);
        }
        return nge;
    }
}