class Solution {
    public int shortestSubarray(int[] nums, int k) {
        long[] pre = new long[nums.length + 1];
        Deque<Integer> deque = new LinkedList<>();
        int res = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            pre[i+1] = pre[i] + nums[i];
        }
        for(int i =0; i<=nums.length; i++){
            while(!deque.isEmpty() && pre[i] - pre[deque.peekFirst()] >= k){
                res = Math.min(res, i-deque.pollFirst());
            }
            while(!deque.isEmpty() && pre[i] <= pre[deque.peekLast()]){
                deque.pollLast();
            }
            deque.addLast(i);
        }
        return res == Integer.MAX_VALUE? -1: res;
    }
}