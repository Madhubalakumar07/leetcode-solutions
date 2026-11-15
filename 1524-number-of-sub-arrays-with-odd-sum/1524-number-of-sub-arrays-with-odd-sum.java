class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = (int)Math.pow(10, 9) + 7;
        int even = 1, odd = 0, sum = 0;
        long ans = 0;
        for(int num : arr){
            sum = (sum + num) % 2;
            if(sum == 1){
                ans = (ans + even) % mod;
                odd++;
            }
            else{
                ans = (ans + odd) % mod;
                even++;
            }
        }
        return (int)ans;
    }
}