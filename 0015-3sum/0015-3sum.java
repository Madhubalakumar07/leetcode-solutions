class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length - 1;
        for(int i=0; i< n; i++){
            if(i > 0 && nums[i] == nums[i-1]){
               continue;
            }
             int j = i+1, k = n;
                while(j  < k){
                    int total = nums[i] + nums[j] + nums[k];
                    if(total > 0){
                        k--;
                    }
                    else if(total < 0){
                        j++;
                    }
                    else{
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        k--;
                        while(j<k && nums[k] == nums[k+1]){
                            k--;
                        }
                    }
                }
        }
        return res;
    }
}