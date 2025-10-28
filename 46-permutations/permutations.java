import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        for (int n : nums) numList.add(n);  // convert array to list
        getPerms(numList, 0, result);
        return result;
    }

    private void getPerms(List<Integer> num, int idx, List<List<Integer>> result) {
        if (idx == num.size() - 1) {
            result.add(new ArrayList<>(num));  // add copy
            return;
        }

        for (int i = idx; i < num.size(); i++) {
            Collections.swap(num, idx, i);  // swap elements in list
            getPerms(num, idx + 1, result);
            Collections.swap(num, idx, i);  // backtrack
        }
    }
}
