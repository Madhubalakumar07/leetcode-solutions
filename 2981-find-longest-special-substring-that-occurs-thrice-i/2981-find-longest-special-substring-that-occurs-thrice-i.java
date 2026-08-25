class Solution {
    public int maximumLength(String s) {
        Map<String, Integer> map = new HashMap<>();
        int res = -1;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String curr = s.substring(i, j+1);
                map.put(curr, map.getOrDefault(curr, 0)+1);
            }
        }
        for(String str : map.keySet()){
            if(map.get(str) >= 3){
                boolean flag = true;
                char ch = str.charAt(0);
                for(int i= 1; i<str.length(); i++){
                    if(str.charAt(i) != ch){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    res = Math.max(res, str.length());
                }
            }
        }
        return res;
    }
}