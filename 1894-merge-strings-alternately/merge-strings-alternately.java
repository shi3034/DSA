class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int k = 0, l1 = word1.length(), l2 = word2.length(), n = 0, m = 0;

        if (l1 <= l2) {
            n = l1;
            m = l2;
        } else {
            n = l2;
            m = l1;
        }

        for (int i = 0; i < n; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        for (int i = n; i < m; i++) {
            if (l1 > l2)
                sb.append(word1.charAt(i));
            else if (l2 > l1)
                sb.append(word2.charAt(i));
        }

        return sb.toString();
    }
}
