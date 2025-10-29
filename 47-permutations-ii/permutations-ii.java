import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort first to easily skip duplicates
        boolean[] used = new boolean[nums.length];  // Track which elements are used
        backtrack(nums, new ArrayList<>(), used, result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));  // Found one permutation
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip if number already used
            if (used[i]) continue;

            // Skip duplicates: only use the first unused occurrence of a duplicate number
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            // Choose the current element
            used[i] = true;
            current.add(nums[i]);

            // Explore further
            backtrack(nums, current, used, result);

            // Backtrack (undo the choice)
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }

  
}
