class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for(int num : nums){
            total += num;
        }
        if(total < Math.abs(target)){
            return 0;
        }
        if((total + target) % 2 == 1){
            return 0;
        }
        int pos = (total + target) / 2;
        int[] dp = new int[pos+1];
        dp[0] = 1;
        for(int num : nums){
            for(int i=pos; i>=num; i--){
                if(num <= i){
                    dp[i] += dp[i -num];
                }
            }
        }
        return dp[pos];
    }
}