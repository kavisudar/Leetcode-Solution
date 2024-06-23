class Solution {
    public int minSwaps(String s) {
        int c=0,swap=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[')
                c++;
            else
                c--;
            if(c==-1)
            {
                swap++;
                c+=2;
            }
        }
        return swap;
    }
}