class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<Character>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*')
            {
                if(!st.empty()){
                st.pop();}
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder res=new StringBuilder();
        for(char c:st){
            res.append(c);
        }
        return res.toString();
    }
}