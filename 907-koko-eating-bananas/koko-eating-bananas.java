class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1, end = 0;

        for (int p : piles)
            end = Math.max(end, p);

        int res = end;

        while (start <= end) {
            long time = 0;
            int mid = start + (end - start) / 2;

            for (int p : piles)
                time += (p + mid - 1) / mid;

            if (time <= h) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }
}