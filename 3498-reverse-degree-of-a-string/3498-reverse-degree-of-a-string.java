class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int st=26;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int n=(int)c-97;
            int a=st-n;
            sum+=(i+1)*a;
        }
        return sum;
    }
}