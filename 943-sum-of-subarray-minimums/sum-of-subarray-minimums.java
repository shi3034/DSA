class Solution {
    public int sumSubarrayMins(int[] arr) {
        long total=0,n=arr.length;
        int left[]=findPSEE(arr);
        int right[]=findNSE(arr);
        int mod=(int)(1e9+7);
        for(int i=0;i<n;i++){
            total=(total+(long)left[i]*right[i]*arr[i])%mod;
        }
        return (int)total;
    }
    public int[] findNSE(int a[]){
        int n=a.length;
        Stack<Integer> st=new Stack<>();
        int nse[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && a[st.peek()]>=a[i])
            st.pop();
            nse[i]=st.isEmpty()?(n-i):(st.peek()-i);
            st.push(i);
        }
        return nse;
    }
    public int[] findPSEE(int a[]){
        int n=a.length;
        Stack<Integer> st=new Stack<>();
        int psee[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && a[st.peek()]>a[i])
            st.pop();
            psee[i]=st.isEmpty()?(i+1):(i-st.peek());
            st.push(i);
        }
        return psee;
    }
}