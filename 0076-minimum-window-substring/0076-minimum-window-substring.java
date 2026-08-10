class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }
        int[] map = new int[128];
        int count = t.length();
        int st = 0, end = 0, minlen = Integer.MAX_VALUE, si = 0;
        for(char ch : t.toCharArray()){
            map[ch]++;
        }
        char[] chs = s.toCharArray();
        while(end < s.length()){
            if(map[chs[end++]]-- > 0){
                count--;
            }
            while(count == 0){
                if(end-st < minlen){
                    si = st;
                    minlen = end -st;
                }
                if(map[chs[st++]]++ == 0){
                    count++;
                }
            }
        }
        return minlen == Integer.MAX_VALUE ? "" : new String(chs, si, minlen);
    }
}