class Solution {
    public int calPoints(String[] op) {
       Stack<Integer>st=new Stack<>();
       for(int i=0;i<op.length;i++)
       {
        if(op[i].equals("C"))
        {
            st.pop();
        }
        else if(op[i].equals("D"))
        {
            int num=st.peek()*2;
            st.push(num);
        }
        else if(op[i].equals("+"))
        {
            int a=st.pop();
            int b=st.peek();
            st.push(a);
            st.push(a+b);
        }
        else{
            st.push(Integer.parseInt(op[i]));
        }
       } 
       if(st.isEmpty())
         return 0;
       int sum=0;
       while(!st.isEmpty())
       {
        sum+=st.pop();
       }
       return sum;
    }
    
}