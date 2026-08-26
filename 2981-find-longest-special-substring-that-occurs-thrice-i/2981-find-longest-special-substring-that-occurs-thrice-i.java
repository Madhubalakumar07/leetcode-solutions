class Solution {
    public int maximumLength(String s) {
        int[][] count = new int[26][s.length()+1];
        int res = -1, curr = 0;
        char prev = '@';
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == prev){
                curr++;
            }
            else{
                curr = 1;
                prev = ch;
            }
            count[ch - 'a'][curr]++;  
        }
        for(int i = 0; i< 26; i++){
            int sum = 0;
            for(int j = s.length(); j>0; j--){
                sum += count[i][j];
                if(sum >= 3){
                    res = Math.max(res, j);
                    break;
                }
            }
        }
        return res;
    }
}