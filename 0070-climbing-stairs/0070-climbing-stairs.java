class Solution {
    public int helper(int n, int[] dp){
        if(n ==1 || n == 2){
            return n;
        }
        if(dp[n] != -1) return dp[n];
        int one = helper(n-1, dp);
        int two = helper(n-2, dp);
        dp[n] = one + two;
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int ans = helper(n, dp);
        return ans;
    }
}