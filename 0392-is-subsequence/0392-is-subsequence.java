class Solution {
    public boolean isSubsequence(String s, String t) {
        int pt1 = 0, pt2 = 0;
        while(pt1 < s.length() && pt2 < t.length()){
            if(s.charAt(pt1) == t.charAt(pt2)){
                pt1++;
                pt2++;
            }
            else{
                pt2++;
            }
        }
        return pt1 == s.length();
    }
}