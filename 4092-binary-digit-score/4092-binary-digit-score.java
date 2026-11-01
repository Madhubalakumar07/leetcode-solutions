class Solution {
    public int calculateScore(int a, int b) {
        String bin1 = Integer.toBinaryString(a);
        String bin2 = Integer.toBinaryString(b);
        int s1 = 0;
        int s2 = 0;
        for(char ch : bin1.toCharArray()){
            if(ch == '1'){
                s1++;
            }
        }
        for(char ch : bin2.toCharArray()){
            if(ch == '1'){
                s2++;
            }
        }
        if(s1 >= s2){
            return s1 * s2;
        }
        return s2 / s1;
    }
}