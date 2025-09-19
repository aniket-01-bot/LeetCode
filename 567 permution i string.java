class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s2.length(), k = s1.length();
        if (k > n) return false;

        int[] frq1 = new int[26];
        for (char c : s1.toCharArray()) {
            frq1[c - 'a']++;
        }

        int[] frq2 = new int[26];
        int left = 0;

        for (int right = 0; right < n; right++) {
            frq2[s2.charAt(right) - 'a']++;

            if (right - left + 1 == k) {
                if (matches(frq1, frq2)) return true;
                frq2[s2.charAt(left) - 'a']--;
                left++;
            }
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}