class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long res = 0, sum = 0;
        int st = 0;
        for(int i= 0; i<nums.length; i++){
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            while(map.get(nums[i]) > 1){
                map.put(nums[st], map.get(nums[st])-1);
                sum -= nums[st];
                st++;
            }
            if((i - st+1) == k){
                res = Math.max(res, sum);
                map.put(nums[st], map.get(nums[st])-1);
                sum -= nums[st];
                st++;
            }
        }
        return res;
    }
}