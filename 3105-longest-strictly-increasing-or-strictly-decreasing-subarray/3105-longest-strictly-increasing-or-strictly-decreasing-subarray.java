class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int dec = 1, inc = 1, res = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                dec = 1;
                inc++;
            }
            else if(nums[i] > nums[i+1]){
                inc = 1;
                dec++;
            }
            else{
                inc = 1;
                dec = 1;
            }
            res = Math.max(res, Math.max(inc, dec));
        }
        return res;
    }
}