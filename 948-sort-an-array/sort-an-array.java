class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        if(n==0 || n==1)
        return nums;
        mergeSort(nums,0,n-1);
        return nums;
    }
    private void mergeSort(int[] arr, int l, int r){
        if(l>=r)
        return;
        int m=(l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
    private void merge(int[] arr, int l, int m, int r)
    {
        int[] temp=new int[r-l+1];
        int i=l,j=m+1,index=0;
        while(i<=m && j<=r){
            if(arr[i]<arr[j]){
                temp[index++]=arr[i];
                i++;
            }
            else
            {
                temp[index++]=arr[j];
                j++;
            }
        }
        while(i<=m){
            temp[index++]=arr[i];
            i++;
        }
        while(j<=r){
            temp[index++]=arr[j];
            j++;
        }
        for(int p=l;p<=r;p++){
            arr[p]=temp[p-l];
        }
    }
}