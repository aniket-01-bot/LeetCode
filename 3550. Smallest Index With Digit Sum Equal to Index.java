class Solution {
    public static int smallestIndex(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0, x = nums[i];
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            if (sum == i) {
                return i;
            }
        }
        return -1;
    }
}