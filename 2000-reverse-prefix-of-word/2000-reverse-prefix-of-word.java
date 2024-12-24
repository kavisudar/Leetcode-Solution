class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character>st=new Stack<>();
        int i=0;
        boolean flag=false;
        for(;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                st.push(word.charAt(i));
                flag=true;
                i++;
                break;
            }
            st.push(word.charAt(i));
        }
        if(flag)
        {
        String ans="";
        while(!st.isEmpty())
        {
            ans+=st.peek();
            st.pop();
        }
          return ans+word.substring(i,word.length());
        }
        // System.out.println(ans);
          
        return word;
    }
}