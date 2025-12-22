class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1, q = n - 1, ptr = m + n - 1;

        while (q >= 0) {
            if (p >= 0 && nums1[p] > nums2[q]) {
                nums1[ptr] = nums1[p];
                p--;
            } else {
                nums1[ptr] = nums2[q--];
            }
            ptr--;
        }
    }
}
