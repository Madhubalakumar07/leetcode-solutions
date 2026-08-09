class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] res = new int[nums.length -k +1];
        int len = 1, n = nums.length;
        for(int i=0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]+1){
                len++;
            }
            else{
                len = 1;
            }
            if(i >= k-1){
                if(len >= k){
                    res[i-k+1] = nums[i];
                }
                else{
                    res[i-k+1] = -1;
                }
            }
        }
        return res;
    }
}