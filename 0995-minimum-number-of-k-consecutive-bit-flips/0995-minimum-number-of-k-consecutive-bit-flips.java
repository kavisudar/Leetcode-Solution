class Solution {

    public int minKBitFlips(int[] nums, int k) {
        boolean[] f = new boolean[nums.length];
        int val = 0;
        int Count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                if (f[i - k]) {
                    val--;
                }
            }
            if (val % 2 == nums[i]) {
                if (i + k > nums.length) {
                    return -1;
                }
                val++;
                f[i] = true;
                Count++;
            }
        }
        return Count;
    }
}