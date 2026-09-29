class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int n: nums)
        {
            freq.put(n, freq.getOrDefault(n, 0)+1);
        }
        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<>(freq.entrySet());
        arr.sort((a,b) -> b.getValue() - a.getValue());
        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i] = arr.get(i).getKey();
        }
        return res;
    }
}