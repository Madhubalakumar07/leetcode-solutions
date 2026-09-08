class Solution {
    public int takeCharacters(String s, int k) {
        int[] freq = new int[3];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        if(freq[0] < k || freq[1] < k || freq[2] < k){
            return -1;
        }
        int res = Integer.MAX_VALUE, left = 0;
        char[] chs = s.toCharArray();
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']--;
            while(Math.min(Math.min(freq[0], freq[1]), freq[2]) < k){
                freq[s.charAt(left++) - 'a']++;
            }
            res = Math.min(res, s.length() - (i-left+1));
        }
        return res;
    }
}