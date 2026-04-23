class Solution {
    public int search(int[] nums, int target) {
        int ind = findMin(nums);
        int index1 = bs(ind, nums.length - 1, nums, target);
        
        if (index1 != -1)
            return index1;
        else
            return bs(0, ind - 1, nums, target);
    }

    private int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right])
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    private int bs(int start, int end, int[] arr, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
            else
                return mid;
        }

        return -1;
    }
}