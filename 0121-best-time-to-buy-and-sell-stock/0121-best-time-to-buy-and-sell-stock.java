class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0],profit=Integer.MIN_VALUE,max=Integer.MIN_VALUE,idx=0;
        for(int i=1;i<prices.length;i++)
        {
            if(buy>prices[i])
            {
                buy=prices[i];
                idx=i;
            }
            else if(buy<prices[i] &&i>idx){
            profit=prices[i]-buy;
            max=Math.max(max,profit);
            }
        }
        if(max==Integer.MIN_VALUE)
            return 0;
        return max;
    }
}