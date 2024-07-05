class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int q=n/8;
        int ans=0;
        int r=n%8;
        int i=1;
        for(;i<=q;i++)
        {
            ans+=8*i;
        }
        if(r==0)
                return ans;
            else
                return ans+r*i;
    }
}