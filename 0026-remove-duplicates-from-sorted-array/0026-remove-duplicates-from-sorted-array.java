class Solution {
    public int removeDuplicates(int[] nums)
     {
        int n=nums.length;
        // int ans[]= new int[n];
        int j=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[j]=nums[i];
                j++;
            }
        }
           return j;
    }
}
