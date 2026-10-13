class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long res = 0;
        int left = 0, right = nums.length-1;
        while(left < right){
            res += (long)nums[right] * nums[right];
            res -= (long)nums[left] * nums[left];
            right--;
            left++;
        }
        if(left == right){
            res += (long)nums[right] * nums[right]; 
        }
        return res;
    }
}