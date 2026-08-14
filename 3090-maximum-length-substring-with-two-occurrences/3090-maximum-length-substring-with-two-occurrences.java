class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxlen = 0, st = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            while(map.get(ch) > 2){
                map.put(s.charAt(st), map.get(s.charAt(st))-1);
                st++;
            }
            maxlen = Math.max(maxlen, (i-st+1));
        }
        return maxlen;
    }
}