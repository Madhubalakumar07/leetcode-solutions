class Solution {
    public boolean checkValidString(String s) 
    {
        Stack<Integer> paran = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for(int i =0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                paran.push(i);
            }
            else if (ch == '*')
            {
                star.push(i);
            }
            else
            {
                if(!paran.isEmpty())
                {
                    paran.pop();
                }
                else if(!star.isEmpty())
                {
                    star.pop();
                }
                else
                {
                    return false;
                }
            }
        } 
        while(!paran.isEmpty() && !star.isEmpty())
        {
            if(paran.pop() > star.pop())
            {
                return false;
            }
        }  
        return paran.isEmpty();
    }
}