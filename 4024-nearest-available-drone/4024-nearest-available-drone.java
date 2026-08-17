class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int max = Integer.MAX_VALUE , index = 0;
        for(int  i = 0 ; i < drones.length ; i++)
        {
            int a = drones[i][0];
            int b = drones[i][1];
            int dis = Math.abs(a - target[0]) + Math.abs(b - target[1]);
            if(dis <= drones[i][2] && dis < max){
                max = dis;
                index = i;

            }
        }
        return max == Integer.MAX_VALUE  ?  - 1 : index;

        
    }
}