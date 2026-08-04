class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res = 0;
        int st = 0, end = people.length-1;
        while(st <= end){
            if(people[st] + people[end] > limit){
                if(people[end] <= limit){
                    res++;
                }
                end--;
            }
            else if(people[st] + people[end] <= limit){
                res++;
                st++;
                end--;
            }
        }
        return res;
    }
}