class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        if(nums[l]<nums[r])
        return nums[l];
        while(l<r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[r])
            l=mid+1;
            else
            r=mid;
        }
        return nums[l];
    }
}