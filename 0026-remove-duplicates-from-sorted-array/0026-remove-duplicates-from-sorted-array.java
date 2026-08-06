class Solution {
    public int removeDuplicates(int[] nums) {
        int ind = 0;
        int pos = 1;
        while (pos < nums.length){
            if(nums[ind] != nums[pos]){
                nums[++ind] = nums[pos];
            }
            pos++;
        }
        return ind+1;
    }
}