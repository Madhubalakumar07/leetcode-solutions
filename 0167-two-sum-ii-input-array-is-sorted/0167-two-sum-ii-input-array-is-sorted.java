class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int st = 0, end = numbers.length-1;
        while(st < end){
            int total = numbers[st] + numbers[end];
            if(total > target){
                end--;
            }
            else if(total < target){
                st++;
            }
            else{
                res[0] = st+1;
                res[1] = end+1;
                break;
            }
        }
        return res;
    }
}