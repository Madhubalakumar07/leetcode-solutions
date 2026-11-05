class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = arr1.length;
        for(int num : arr1){
            for(int val : arr2){
                if(Math.abs(num - val) <= d){
                    res--;
                    break;
                }
            }
        }
        return res;
    }
}