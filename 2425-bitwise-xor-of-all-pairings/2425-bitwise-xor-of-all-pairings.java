class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int ans=0;
        if((n%2==0)&&(m%2==0))
            return 0;
       else if(n%2==0&&m!=0)
        {
            for(int x:nums1)
            {
                ans^=x;
            }
            return ans;
        }
       else if(n%2!=0&&m%2==0)
        {
            for(int x:nums2)
            {
                ans^=x;
            }
            return ans;
        }
        else 
        {
            for(int x:nums1)
            {
                ans^=x;
            }
            for(int x:nums2)
            {
                ans^=x;
            }
            return ans;
        }
        
    }
}