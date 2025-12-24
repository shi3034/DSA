class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int i = people.length - 1, j = 0;

        while (j <= i) {
            if (people[i] + people[j] <= limit) {
                j++;
            }
            i--;
            boats++;
        }
        return boats;
    }
}
