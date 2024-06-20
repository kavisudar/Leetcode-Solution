class Solution {
    
     static int rev(int x)
        {
            int rem=0; int res=0;
            if(x<10)
            {
                return x;
            }
            else
            {
                while(x>0)
                {
                rem=x%10;
                res=res*10+rem;
                x=x/10;
                }
             return res;   
            }
            
        }
    public int countDistinctIntegers(int[] nums) 
    {
        int n=nums.length;
        Set<Integer> ans = new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            
            ans.add(nums[i]);
           
            ans.add(rev(nums[i]));
        }
     int k=ans.size();
    
    
    return k;
    }
}