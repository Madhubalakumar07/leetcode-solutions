class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int st = 0, len = p.length();
        char[] tar = p.toCharArray();
        Arrays.sort(tar);
        for(int i=0; i<s.length(); i++){
            if(i-st+1 == len){
                String str = s.substring(st, i+1);
                char[] curr = str.toCharArray();
                Arrays.sort(curr);
                if(Arrays.equals(tar, curr)){
                    res.add(st);
                }
                st++;
            }
        }
        return res;
    }
}