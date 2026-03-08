class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zerocount = 0;
        int onecount = 0;
        int twocount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                zerocount++;
            else if (nums[i] == 1)
                onecount++;
            else
                twocount++;
        }

        for (int i = 0; i < n; i++) {
            if (i < zerocount)
                nums[i] = 0;
            else if (i < zerocount + onecount)
                nums[i] = 1;
            else
                nums[i] = 2;
        }
    }
}