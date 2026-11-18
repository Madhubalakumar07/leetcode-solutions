class Solution {
    public int minChanges(String s) {
        int res = 0;
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i+=2){
            if(chars[i] != chars[i+1]){
                res++;
            }
        }
        return res;
    }
}