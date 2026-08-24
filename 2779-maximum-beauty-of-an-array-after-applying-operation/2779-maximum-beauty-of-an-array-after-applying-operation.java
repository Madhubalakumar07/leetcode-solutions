class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int st = 0, i;
        for(i = 0; i<nums.length; i++){
            int mat = nums[i] - nums[st];
            if(mat > 2*k){
                st ++;
            }
        }
        return i - st;
    }
}