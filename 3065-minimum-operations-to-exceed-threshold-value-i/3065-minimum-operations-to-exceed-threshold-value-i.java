class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(k>nums[i])
                c++;
        }
        return c;
    }
}