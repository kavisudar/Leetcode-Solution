class Solution {
    public void reverseString(char[] s) {
        // is.length;
        char[] s1 =new char[s.length];
        int r=s.length-1;
        for(int i=0;i<s.length;i++)
        {
            s1[i]=s[r];
            r--;
        }
        for(int i=s.length-1;i>=0;i--)
        {
            s[i]=s1[i];
        }
    
        System.out.println(Arrays.toString(s1));
    }
}