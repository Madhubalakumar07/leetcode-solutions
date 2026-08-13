class Solution {
    public int hammingDistance(int x, int y) {
        int res = 0, mask = 1;
        for(int i=1; i<=32; i++){
            if((mask&x) != (mask&y)){
                res++;
            }
            mask <<= 1;
        }
        return res;
    }
}