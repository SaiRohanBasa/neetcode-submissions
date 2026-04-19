class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        dp[n-1] = nums[n-1];
        int i = n-2;
        while (i >= 0) {
            if (i+2 >= n) {
                dp[i] = Math.max(nums[i],dp[i+1]);
            } else {
                dp[i] = Math.max(nums[i] + dp[i+2], dp[i+1]);
            }
            i--;
        }
        return dp[0];
    }
}
