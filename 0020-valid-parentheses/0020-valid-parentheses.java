class Solution {
    public boolean isValid(String s) 
    {
        if(s.length()%2 == 1) return false;
        Stack<Character> stc = new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch == '(' || ch == '[' || ch == '{' || ch == '<')
            {
                stc.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}' || ch == '>')
            {
                if(stc.isEmpty()) return false;
                char top = stc.pop();
                if((ch == ')' && top != '(') || 
                    (ch == ']' && top != '[') || 
                    (ch == '}' && top!= '{') || 
                    (ch == '>' && top != '<'))
                {
                    return false;
                }
            }
        }
        return stc.isEmpty();    
    }
}