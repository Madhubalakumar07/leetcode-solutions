class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] flag = new boolean[10001];
        for(int x : nums1){
            flag[x] = true;
        }
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int ind = 0;
        for(int x : nums2){
            if(flag[x]){
                res[ind++] = x;
                flag[x] = false;
            }
        }
        return Arrays.copyOf(res, ind);
    }
}