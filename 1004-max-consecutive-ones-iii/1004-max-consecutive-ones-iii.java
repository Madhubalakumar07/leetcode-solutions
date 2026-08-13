class Solution {
    public int longestOnes(int[] nums, int k) {
        int res = 0, st = 0, zeros = 0;
        for(int i= 0;i<nums.length; i++){
            if(nums[i] == 0){
                zeros++;
            }
            while(zeros > k){
                if(nums[st++] == 0){
                    zeros--;
                }
            }
            res = Math.max(res, (i-st+1));
        }
        return res;
    }
}