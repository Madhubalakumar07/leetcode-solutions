class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int tar = nums[nums.length-1];
        int res = 0;
        for(int num : nums){
            res += tar - num;
        }
        return res;
    }
}