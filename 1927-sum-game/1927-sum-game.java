class Solution {
    public boolean sumGame(String num) {
        int leftsum = 0, rightsum = 0, leftques = 0, rightques = 0;
        char[] chs = num.toCharArray();
        for(int i= 0;i<chs.length; i++){
            if(i < chs.length/2){
                if(chs[i] == '?'){
                    leftques++;
                }
                else{
                    leftsum += chs[i] - '0';
                }
            }
            else{
                if(chs[i] == '?'){
                    rightques++;
                }
                else{
                    rightsum += chs[i] - '0';
                }
            }
        }
        return 2 * (leftsum - rightsum) != 9 * (rightques - leftques);
    }
}