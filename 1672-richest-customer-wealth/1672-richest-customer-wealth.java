class Solution {
    public int maximumWealth(int[][] ac) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ac.length;i++)
        {
            int ans=0;
            for(int j=0;j<ac[i].length;j++)
            {
                ans+=ac[i][j];
            }
             if(ans>max)
                {
                    max=ans;
                }
        }
        return max;
    }
}