class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int ind = 0;
        for(int num : nums){
            res[ind++] = num*num;
        } 
        Arrays.sort(res);
        return res;
    }
}