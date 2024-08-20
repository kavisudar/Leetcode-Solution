class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3!=0)
            {
                int ans=0;
                ans=nums[i]+1;
                if(ans%3==0)
                {
                    count++;
                }
                ans=nums[i]-1;
                if(ans%3==0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}