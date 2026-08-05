class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)){
            int res = 0;
            seen.add(n);
            while(n > 0){
                res += Math.pow((n%10), 2);
                n /= 10;
            }
            n = res;
        }
        return n == 1;
    }
}