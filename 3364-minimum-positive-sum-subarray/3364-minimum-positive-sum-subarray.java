class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res = Integer.MAX_VALUE;
        for(int i=0; i<nums.size(); i++){
            int sum = 0;
            for(int j=i; j<nums.size(); j++){
                int len = j-i+1;
                if(len <= r){
                    sum += nums.get(j);
                }
                if(len >= l && len <= r && sum > 0){
                    res = Math.min(res, sum);
                }
            }
        }
        return res == Integer.MAX_VALUE?-1:res;
    }
}