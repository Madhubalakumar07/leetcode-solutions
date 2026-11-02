class Solution {
    public int minMoves2(int[] nums) {
        int mid = 0, moves = 0;
        Arrays.sort(nums);
        mid = nums[nums.length / 2];
        for(int num : nums){
            moves += Math.abs(mid - num);
        }
        return moves;
    }
}