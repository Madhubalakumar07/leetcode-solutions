class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stc = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '('){
                if(stc.size() > 0){
                    res.append(curr);
                }
                stc.push(curr);
            }
            else if(curr == ')'){
                stc.pop();
                if(stc.size() > 0){
                    res.append(curr);
                }
            }
        }
        return res.toString();
    }
}