class Solution
{
    public int balancedStringSplit(String s)
    {
        int count=0;
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='L')
            {
                count++;
            }
            else if(s.charAt(i)=='R')
            {
                count--;
            }
            if(count==0){
                ans++;
            }
        }
        return ans;
    }
}