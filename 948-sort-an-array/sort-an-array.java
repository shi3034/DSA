/*class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
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
    private void merge(int[] arr, int l, int m, int r){
        ArrayList<Integer> temp=new ArrayList<>();
        int i=l,j=m+1;
        while(i<=m && j<=r){
            if(arr[i]<arr[j])
            {
                temp.add(arr[i]);
                i++;
            }
            else
            {
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=m){
            temp.add(arr[i]);
            i++;
        }
        while(j<=r){
            temp.add(arr[j]);
            j++;
        }
        for(int p=l;p<=r;p++){
            arr[p]=temp.get(p-l);
        }
    }
}*/
class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // Step 2: Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // Swap root (largest) with last element
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            // Heapify reduced heap
            heapify(nums, i, 0);
        }

        return nums;
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}

