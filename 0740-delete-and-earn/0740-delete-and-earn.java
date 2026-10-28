class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] freq = new int[10001];
        for(int num : nums){
            freq[num] += num;
        }
        int prev1 = 0;
        int prev2 = 0;
        for(int val : freq){
            int temp = prev1;
            prev1 = Math.max(val+prev2, prev1);
            prev2 = temp;
        }
        return prev1;
    }
}