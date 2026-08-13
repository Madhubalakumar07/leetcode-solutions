class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int res = 0, st = 0, prod = 1;
        for(int i= 0; i<nums.length; i++){
            prod *= nums[i];
            while(prod >= k){
                prod /= nums[st];
                st++;
            }
            res += (i - st) +1;
        }
        return res; 
    }
}