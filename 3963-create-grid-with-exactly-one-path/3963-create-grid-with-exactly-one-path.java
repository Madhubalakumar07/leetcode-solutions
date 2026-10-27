class Solution {
    public String[] createGrid(int m, int n) {
        String[] res = new String[m];
        for(int i=0; i<m; i++){
            StringBuilder curr = new StringBuilder();
            for(int j=0; j<n; j++){
                if(i == 0 || j == n-1){
                    curr.append('.');
                }
                else{
                    curr.append('#');
                }
            }
            res[i] = curr.toString();
        }
        return res;
    }
}