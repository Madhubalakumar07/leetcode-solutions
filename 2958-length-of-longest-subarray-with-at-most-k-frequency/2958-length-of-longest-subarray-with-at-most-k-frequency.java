class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxlen = 0, st = 0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            while(map.get(nums[i]) > k){
                map.put(nums[st], map.get(nums[st])-1);
                st++;
            }
            maxlen = Math.max(maxlen, (i-st+1));
        }
        return maxlen;
    }
}