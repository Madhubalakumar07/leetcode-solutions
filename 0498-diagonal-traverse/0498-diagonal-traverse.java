class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int x = 0, y = 0, row = mat.length, col = mat[0].length;
        int[] res = new int[row * col];   
        for(int i = 0; i<res.length; i++){
            res[i] = mat[x][y];
            if((x+y) % 2 == 0){
                if(y == col-1){
                    x++;
                }
                else if(x == 0){
                    y++;
                }
                else{
                    x--;
                    y++;
                }
            }
            else{
                if(x == row - 1){
                    y++;
                }
                else if(y == 0){
                    x++;
                }
                else{
                    x++;
                    y--;
                }
            }
        }
        return res;
    }
}