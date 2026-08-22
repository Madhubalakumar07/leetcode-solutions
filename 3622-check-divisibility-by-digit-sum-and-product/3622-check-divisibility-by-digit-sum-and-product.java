class Solution {
    public boolean checkDivisibility(int n) {
        int prod = 1, sum = 0, temp = n;
        while(temp > 0){
            sum += temp % 10;
            prod *= temp % 10;
            temp /= 10;
        }
        return n % (sum + prod) == 0;
    }
}