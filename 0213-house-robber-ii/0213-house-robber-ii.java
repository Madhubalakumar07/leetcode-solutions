class Solution {
    public int helper(int[] nums, int st, int end){
        int len = end - st +1;
        int[] dp = new int[nums.length];
        dp[0] = nums[st];
        if(len == 1){
            return dp[0];
        }
        dp[1] = Math.max(nums[st], nums[st+1]);
        for(int i=2; i<len; i++){
            dp[i] = Math.max(nums[st+i] + dp[i-2], dp[i-1]);
        }
        return dp[len - 1];
    }
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        else if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int first = helper(nums, 0, nums.length-2);
        int last = helper(nums, 1, nums.length-1);
        return Math.max(first, last);
    }
}