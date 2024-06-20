class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int n=nums.length-1;
        for (int i = n; i >= 0; i--) {
            if (nums[i] == val) {
                count++;
                for (int j = i; j < n; j++) {
                    nums[j] = nums[j+1];
                }
            }
        }
        return n+1 - count;
    }
}