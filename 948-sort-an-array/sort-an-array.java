public class Solution {
    public int[] sortArray(int[] nums) {
        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> positives = new ArrayList<>();

        for (int num : nums) {
            if (num < 0) {
                negatives.add(-num);
            } else {
                positives.add(num);
            }
        }

        if (!negatives.isEmpty()) {
            radixSort(negatives);
            Collections.reverse(negatives);
            for (int i = 0; i < negatives.size(); i++) {
                negatives.set(i, -negatives.get(i));
            }
        }

        if (!positives.isEmpty()) {
            radixSort(positives);
        }

        int index = 0;
        for (int num : negatives) {
            nums[index++] = num;
        }
        for (int num : positives) {
            nums[index++] = num;
        }
        return nums;
    }

    private void countSort(ArrayList<Integer> arr, int n, int d) {
        int[] count = new int[10];
        for (int num : arr) {
            count[(num / d) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, 0));
        for (int i = n - 1; i >= 0; i--) {
            int idx = (arr.get(i) / d) % 10;
            res.set(count[idx] - 1, arr.get(i));
            count[idx]--;
        }

        for (int i = 0; i < n; i++) {
            arr.set(i, res.get(i));
        }
    }

    private void radixSort(ArrayList<Integer> arr) {
        int n = arr.size();
        int maxElement = Collections.max(arr);
        int d = 1;

        while (maxElement / d > 0) {
            countSort(arr, n, d);
            d *= 10;
        }
    }
}