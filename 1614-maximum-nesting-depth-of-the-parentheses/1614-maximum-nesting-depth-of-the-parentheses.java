class Solution {
    public int maxDepth(String s) 
    {
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        for(char ch: s.toCharArray())
        {
            ans = ans > stack.size()?ans:stack.size();
            if(ch == '(')
            {
                stack.push(ch);
            }
            if(ch == ')')
            {
                stack.pop();
            }
        }   
        return ans; 
    }
}