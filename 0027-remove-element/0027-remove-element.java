class Solution {
    public int removeElement(int[] nums, int val) {
        int ind = 0;
        int pos = 0;
        while(pos < nums.length){
            if(nums[pos] != val){
                nums[ind++] = nums[pos];
            }
            pos++;
        }
        return ind;
    }
}