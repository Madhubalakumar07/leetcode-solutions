class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stc = new Stack<>();
        StringBuilder curr = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stc.push(curr);
                curr = new StringBuilder();
            }
            else if(ch == ')'){
                curr.reverse();
                StringBuilder prev = stc.pop();
                prev.append(curr);
                curr = prev;
            }
            else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}