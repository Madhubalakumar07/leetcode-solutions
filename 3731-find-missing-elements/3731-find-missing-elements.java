class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int ind = 0;
        for(int i = nums[0]; i<nums[nums.length-1]; i++){
            if(nums[ind] == i){
                ind++;
            }
            else{
                res.add(i);
            }
        }
        return res;
    }
}