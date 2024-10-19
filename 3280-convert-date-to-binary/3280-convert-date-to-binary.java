class Solution {
    public String convertDateToBinary(String date) {
        String str[]=date.split("-");
        String ans="";
        for(int i=0;i<str.length;i++)
        {
            int n=Integer.parseInt(str[i]);
            if(i==str.length-1)
                ans+=Integer.toBinaryString(n);
            else{   
                ans+=Integer.toBinaryString(n);
                ans+="-";
            }
        }
        return ans;
    }
}