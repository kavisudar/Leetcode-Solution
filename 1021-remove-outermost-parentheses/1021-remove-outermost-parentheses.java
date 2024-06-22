class Solution {
    public String removeOuterParentheses(String s) {
        int i=0;
        int count=0;
        int n=s.length();
        // Stack<Integer> st = new Stack<Integer>();
        String str=new String("");
        while(i<n)
        {
            if(s.charAt(i)=='(')
            {
                count++;
            if(count>1)
            {
                str=str+'(';
            }    }
            else{
                count--;
                if(count>0)
                {
                    str=str+')';
                }
            }
            i++;
        }
       return str; 
    }
}