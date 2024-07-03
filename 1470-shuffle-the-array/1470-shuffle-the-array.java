class Solution {
    public int[] shuffle(int[] nums, int n) {
        // int l=nums.length;
        int k=0;
        int []ans=new int[nums.length];
        for(int j=0;j<nums.length/2;j++){
        for(int i=j;i<nums.length;i=i+n)
        {
            ans[k++]=nums[i];
        }
        }
        return ans;
    }
}