class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> st=new HashSet<>();
        HashSet<Integer> st2=new HashSet<>();
        for(int x:nums1)
            st.add(x);
        for(int a:nums2)
        {
            if(st.contains(a))
                st2.add(a);
        }
        // int ans[]=new int[st2.size()];
        // for(int )

         return st2.stream().mapToInt(Integer ::intValue).toArray();
    }
}