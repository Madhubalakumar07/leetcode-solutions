class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, minlen = Integer.MAX_VALUE, st = 0;
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            while(sum >= target){
                if((i - st+1) < minlen){
                    minlen = i - st+1;
                }
                sum -= nums[st++];
            }
        }
        return minlen == Integer.MAX_VALUE? 0 : minlen;
    }
}