class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE / 2;
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1, k = nums.length-1;
            while(j < k){
                int total = nums[i] + nums[j] + nums[k];
                if(Math.abs(total - target) < Math.abs(res - target)){
                    res = total;
                }
                if(total < target){
                    j++;
                }
                else if(total > target){
                    k--;
                }
                else{
                    return total;
                }
            }
        }
        return res;
    }
}