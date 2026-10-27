class Solution {
    public int fib(int n) {
        int f0 = 0;
        int f1 = 1;
        int curr = f0 + f1;
        if(n == 0){
            return 0;
        }
        else if(n == 1 || n == 2){
            return 1;
        }
        for(int i=3; i<=n; i++){
            f0 = curr;
            curr = curr + f1;
            f1 = f0;
        }
        return curr;
    }
}