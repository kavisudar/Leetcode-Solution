class Solution {
    public int search(int[] nums, int t) {
        int s=0,e=nums.length-1;
        while(s<=e)
        {
           int mid=s+(e-s)/2;
            if(t<nums[mid])
            {
                e=mid-1;
            }
            else if(t>nums[mid])
            {
                s=mid+1;
            }
            else
                return mid;
        }
        return -1;
    }
}