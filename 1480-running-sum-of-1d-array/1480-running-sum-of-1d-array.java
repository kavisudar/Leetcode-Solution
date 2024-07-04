class Solution {
    public int[] runningSum(int[] nums) {
      int[] ans=new int[nums.length];
      int x=nums[0];
       ans[0]=nums[0];
      for(int i=1;i<nums.length;i++)
      {
               x+=nums[i];
            ans[i]=x;
      }
    //   ans[nums.length-1]=ans[nums.length-2]+nums[nums.length-1];
      return ans;  
    }
}