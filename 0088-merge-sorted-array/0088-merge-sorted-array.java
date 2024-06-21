class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=nums1.length;
        int i=0;
        while(m<l)
        {
            nums1[m++]=nums2[i++];
        }
        // System.out.println(nums1);
        Arrays.sort(nums1);
    }
}