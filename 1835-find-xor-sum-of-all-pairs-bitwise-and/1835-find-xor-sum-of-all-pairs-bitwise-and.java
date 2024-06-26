class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int ans1=0;
        int ans2=0;
        for(int i=0;i<n;i++)
        {
            ans1^=arr1[i];
        }
        for(int j=0;j<m;j++)
        {
            ans2=ans2^arr2[j];
        }
        // int res=a
        return ans1&ans2;
    }
}