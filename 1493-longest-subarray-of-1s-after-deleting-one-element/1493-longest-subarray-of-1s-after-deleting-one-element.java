class Solution {
    public int longestSubarray(int[] nums) {
        int res = 0, st = 0, zeros = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                zeros++;
            }
            while(zeros > 1){
                if(nums[st++] == 0){
                    zeros--;
                }
            }
            res = Math.max(res, (i-st+1-zeros));
        }
        return res==nums.length? res-1: res;
    }
}