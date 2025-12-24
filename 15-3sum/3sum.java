class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int complement = 0 - nums[i];
            int p = i + 1, q = n - 1;

            while (p < q) {
                int sum = nums[p] + nums[q];

                if (sum == complement) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[p]);
                    list.add(nums[q]);
                    list.add(nums[i]);
                    ans.add(list);

                    while (p < q && nums[p] == nums[p + 1])
                        p++;
                    while (p < q && nums[q] == nums[q - 1])
                        q--;

                    p++;
                    q--;
                } else if (sum > complement) {
                    q--;
                } else {
                    p++;
                }
            }
        }
        return ans;
    }
}
