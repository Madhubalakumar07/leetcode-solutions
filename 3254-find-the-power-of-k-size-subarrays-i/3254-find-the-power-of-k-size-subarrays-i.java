class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] res = new int[nums.length -k +1];
        int ind = 0;
        for(int i = k-1; i<nums.length; i++){
           int[] sub = Arrays.copyOfRange(nums, (i-k+1), i+1);
           boolean flag = true;
           for(int j=0; j<sub.length-1;j++){
                if(sub[j]+1 != sub[j+1]){
                    flag = false;
                    break;
                }
           }
           if(flag){
                res[ind++] = sub[sub.length-1];
           }
           else{
                res[ind++] = -1;
           }
        }
        return res;
    }
}