class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char[] s1 =new char[n];
        int r=n-1;
        for(int i=0;i<n;i++)
        {
            s1[i]=s[r];
            r--;
        }
        for(int i=n-1;i>=0;i--)
        {
            s[i]=s1[i];
        }
    
        // System.out.println(Arrays.toString(s1));
    }
}