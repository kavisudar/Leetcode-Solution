class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        // int ans=0;
        if(nums[0]!=0) return 0;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]+1!=nums[1+i])
                return nums[i]+1;
        }
        return nums[n-1]+1;
    }
}