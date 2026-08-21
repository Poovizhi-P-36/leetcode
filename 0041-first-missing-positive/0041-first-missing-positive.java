class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        boolean[] found = new boolean[n + 1];

        // Step 1: Mark the positive numbers
        for (int i = 0; i < n; i++) {

            if (nums[i] > 0 && nums[i] <= n) {
                found[nums[i]] = true;
            }
        }

        // Step 2: Find the first missing positive number
        for (int i = 1; i <= n; i++) {

            if (found[i] == false) {
                return i;
            }
        }

        // If 1 to n are all present
        return n + 1;
    }
}