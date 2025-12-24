class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;

        Arrays.sort(nums);
        int max = 0, i = 0, c = 0;

        while (i + 1 < n) {
            if (nums[i + 1] - nums[i] == 1) {
                c++;
                i++;
            } else if (nums[i + 1] == nums[i]) {
                i++;
            } else {
                if (c > max)
                    max = c;
                c = 0;
                i++;
            }
            if (c > max)
                max = c;
        }
        return max + 1;
    }
}
