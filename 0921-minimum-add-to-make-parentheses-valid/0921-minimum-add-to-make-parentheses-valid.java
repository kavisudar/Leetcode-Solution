class Solution {
    public int minAddToMakeValid(String s) {
        int r=0;
        Stack<Character>st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='(')
           {
                st.push(s.charAt(i));
           }
           else if(s.charAt(i)==')')
           {
            if(!st.isEmpty())
            {
                st.pop();
            }
            else
            {
                r++;
            }
           }
        }
        // int ans=st.size();
    return Math.abs(st.size()+r);
    }
}