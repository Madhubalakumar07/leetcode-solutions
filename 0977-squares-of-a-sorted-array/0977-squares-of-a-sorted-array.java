class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int st = 0, end = nums.length-1, ind = nums.length-1;
        while(st <= end){
            if(nums[st]*nums[st] > nums[end]*nums[end]){
                res[ind--] = nums[st]*nums[st];
                st++;
            }
            else{
                res[ind--] = nums[end]*nums[end];
                end--;
            }
        }
        return res;
    }
}