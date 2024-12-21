class Solution {
    public int maximumCount(int[] nums) {
       int pos=0,neg=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]<=-1)
            neg++;
        else if(nums[i]>=1)
            pos++;
       } 
       return Math.max(pos,neg);
    }
}