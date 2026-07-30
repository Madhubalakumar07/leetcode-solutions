class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int st = 0, end = height.length-1;
        while(st < end){
            int length = Math.min(height[st], height[end]);
            int width = end - st;
            ans = (length*width) > ans?(length*width):ans;
            if(height[st] < height[end]){
                st++;
            }
            else{
                end--;
            }
        }
        return ans;
    }
}